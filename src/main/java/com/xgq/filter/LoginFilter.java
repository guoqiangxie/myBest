package com.xgq.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by xieguoqiang on 14-5-23.
 */
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        if (((HttpServletRequest) request).getSession().getAttribute("isLogin") != null)
            chain.doFilter(request, response);
        else {
            request.getRequestDispatcher("/login").forward(request, response);
            return;
        }
    }

    @Override
    public void destroy() {
    }
}
