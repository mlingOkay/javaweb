package com.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Author: mlingOkay
 * @CreateTime: 2022-09-21  22:25
 * @Description: TODO
 * @Version: 1.0
 */
public class EncodingFilter implements Filter {
    public EncodingFilter(){
        System.out.println("过滤器构造");
    }
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setContentType("text/html;chharset=utf-8");
        filterChain.doFilter(servletRequest,servletResponse);
    }


    @Override
    public void destroy() {
        System.out.println("过滤器销毁");
    }
}
