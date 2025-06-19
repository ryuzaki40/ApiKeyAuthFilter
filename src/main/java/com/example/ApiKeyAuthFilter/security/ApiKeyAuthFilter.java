package com.example.ApiKeyAuthFilter.security;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.io.IOException;

@Component
public class ApiKeyAuthFilter implements Filter {

    @Value("${api.key}")
    private String configuredApiKey;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
    {
        HttpServletRequest req = (HttpServletRequest) request;
        String requestApiKey= req.getHeader("X-API-KEY");

        if(configuredApiKey.equals(requestApiKey))
        {
            chain.doFilter(request, response);
        }
        else 
        {
            HttpServletResponse res = (HttpServletResponse) response;
            res.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            res.getWriter().write("Invalid or missing API");
        }

    }

}
