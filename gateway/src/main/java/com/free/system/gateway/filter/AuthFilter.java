package com.free.system.gateway.filter;

import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * description:
 * @author suwenguang@52tt.com
 * @date 2019/5/22
 * @version 1.0.0
 **/
@Component
public class AuthFilter extends OncePerRequestFilter {


    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        if ("/sys/console/login".equals(httpServletRequest.getRequestURI()) || httpServletRequest.getRequestURI().contains("/sys/console/static")) {
            filterChain.doFilter(httpServletRequest, httpServletResponse);
            return;
        }
        Object token = httpServletRequest.getAttribute("token");
        if (ObjectUtils.isEmpty(token)) {
            String s = httpServletRequest.getContextPath() + "/login";
            httpServletResponse.sendRedirect(s);
            return;
        }
        //todo:解密token
        filterChain.doFilter(httpServletRequest, httpServletResponse);
    }
}
