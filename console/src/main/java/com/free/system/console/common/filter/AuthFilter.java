package com.free.system.console.common.filter;

import com.free.system.core.common.costtime.usage.CostTime;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
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
        Cookie[] cookies = httpServletRequest.getCookies();
        for( Cookie cookie: cookies  ){
            System.out.println(cookie.getName());
        }
        Object token = httpServletRequest.getAttribute("token");
        if (ObjectUtils.isEmpty(token)){
//            httpServletResponse.sendRedirect("http://baidu.com");
        }
        //todo:解密token
        filterChain.doFilter(httpServletRequest, httpServletResponse);
    }
}
