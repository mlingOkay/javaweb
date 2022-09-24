package com.dao;

import com.utils.BaseJdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author: mlingOkay
 * @CreateTime: 2022-09-21  21:39
 * @Description: TODO
 * @Version: 1.0
 */
public class UserDaoImpl implements UserDao{
        private BaseJdbc db=null;
        private Connection con=null;
        public UserDaoImpl(){
            db = new BaseJdbc();
            con=db.getCon();
        }
        @Override
        public boolean valiLogin(String username,String userpass)
        {
            boolean flag=false;
            PreparedStatement ps=null;
            ResultSet rs=null;
            String sql="select *from user where userName=? and userPass = ?";
            try {
                ps=con.prepareStatement(sql);
                ps.setString(1,username);
                ps.setString(2,userpass);
                rs=ps.executeQuery();
                if(rs.next()) {
                    flag=true;
                }
            }catch (SQLException e) {
                //TODO Auto-generated catch block
                e.printStackTrace();
            }finally {
                db.closeAll(con,ps,null);
            }
            return flag;
        }
}

