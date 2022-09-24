package com.dao;

import com.entity.Product;
import com.utils.BaseJdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: mlingOkay
 * @CreateTime: 2022-09-21  21:28
 * @Description: TODO
 * @Version: 1.0
 */
public class ProductDaoImpl implements ProductDao{
    private BaseJdbc db=null;
    private Connection con=null;
    public ProductDaoImpl(){
        db=new BaseJdbc();
        con=db.getCon();
    }
    @Override
    public int addProduct(Product p) {
        PreparedStatement ps=null;
        String sql="insert into product(pname,pprice) values(?,?)";
        int n = 0;
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1, p.getPname());
            ps.setFloat(2, p.getPprice());
            n=ps.executeUpdate();
            System.out.println(n);
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            db.closeAll(con,ps,null);
        }
        return n;
    }
    @Override
    public List<Product> getList() {
        PreparedStatement ps=null;
        String sql="select *from product";
        ResultSet rs=null;
        List<Product> list=new ArrayList<Product>();
        try{
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                Product p=new Product(rs.getInt(1), rs.getString(2), rs.getFloat(3));
                list.add(p);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            db.closeAll(con,ps,rs);
        }
        return list;
    }

}
