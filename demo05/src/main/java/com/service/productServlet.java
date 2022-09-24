package com.service;

import com.dao.ProductDao;
import com.dao.ProductDaoImpl;
import com.entity.Product;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author: mlingOkay
 * @CreateTime: 2022-09-21  21:48
 * @Description: TODO
 * @Version: 1.0
 */
public class productServlet  extends HttpServlet {
    private static final long serialVersionUID=1L;

    public productServlet() {
        super();
        //TODO Auto-generated constructor stub
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException {
        doPost(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException {
        String action=request.getParameter("action");//获取 action 参数值
        if(action.equals("add")) {
            add(request,response);
        }
        if(action.equals("list")) {
            list(request,response);
        }
    }

    protected void add(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String pname=request.getParameter("pname");
        Float pprice=Float.parseFloat(request.getParameter("pprice"));

        Product product=new Product();
        product.setPname(pname);
        product.setPprice(pprice);

        //创建功能类对象来实现功能
        ProductDao pdao=new ProductDaoImpl();
        int n = 0;

        try {
            n = pdao.addProduct(product);
        }catch (Exception e) {
            e.printStackTrace();
            //然后跳转到错误页面
            request.getRequestDispatcher("/failure.jsp").forward(
                    request,response);
            return;
        }
        if(n == 1)         //添加成功
        {
            request.getRequestDispatcher("/addproduct.jsp").forward(request,response);
        }
        else
        {
            //然后跳转到错误页面
            request.getRequestDispatcher("/failure.jsp").forward(request,response);
        }
    }
    protected void list(HttpServletRequest request,HttpServletResponse response)
            throws ServletException,IOException{
        ProductDao pdao = new ProductDaoImpl();
        List<Product> productList=pdao.getList();
        HttpSession session=request.getSession();
        session.setAttribute("productlist",productList);
        response.sendRedirect("listproduct.jsp");
    }

}
