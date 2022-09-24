package com.service;

import com.dao.UserDao;
import com.dao.UserDaoImpl;
import com.entity.User;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: mlingOkay
 * @CreateTime: 2022-09-21  21:43
 * @Description: TODO
 * @Version: 1.0
 */

public class loginServlet extends HttpServlet {
    public loginServlet(){
        super();
    }


    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.doPost(request,response);
    }


    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String uname=request.getParameter("UserName");
        String upass=request.getParameter("userPass");
        //封装用户对象
        System.out.println(1111);
        User user=new User();
        user.setUserName(uname);
        user.setUserPass(upass);
        String username=(String) user.getUserName();
        String userpass=(String) user.getUserPass();

        UserDao dao=new UserDaoImpl();
        boolean flag=false;

        try{
            flag=dao.valiLogin(username,userpass);
        }catch (Exception e) {
            e.printStackTrace();
            request.getRequestDispatcher("/failure.jsp").forward(request,response);
            return;
        }
        if(flag==true)
        {
            request.getRequestDispatcher("/addproduct.jsp").forward(request,response);
        }
        else
        {
            request.getRequestDispatcher("/failure.jsp").forward(request,response);
        }
    }

    @Override
    public void destroy(){
        super.destroy();
    }
}
