package com.utils;

import java.sql.*;

/**
 * @Author: mlingOkay
 * @CreateTime: 2022-09-21  21:29
 * @Description: TODO
 * @Version: 1.0
 */
public class BaseJdbc {
    private Connection con=null;


    public BaseJdbc() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("加载数据库驱动失败");
        }
    }

    public Connection getCon(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaweb", "root", "admin");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public void closeAll(Connection con, PreparedStatement ps, ResultSet rs)  {
        if (rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (ps!=null){
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (con!=null){
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
