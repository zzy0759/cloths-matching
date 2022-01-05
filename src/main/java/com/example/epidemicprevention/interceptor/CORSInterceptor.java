package com.example.epidemicprevention.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author ZZY
 * @Date 2021/10/26
 */
@Component
public class CORSInterceptor implements HandlerInterceptor{
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Headers", "*");
        response.setHeader("Access-Control-Allow-Methods", "GET, PUT, DELETE, POST, OPTIONS");
        response.setCharacterEncoding("utf8");
        response.setContentType("text/json;charset = UTF-8");
        return true;
    }
}
