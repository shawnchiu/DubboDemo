package cn.rejoicy.dubbodemo.demoprovider.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

/**
 * @author qxl
 * @date 2019/5/7 17:19
 */
@Component
public class TestFilter implements Filter, FilterConfig {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("time filter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("time filter start");
        long startTime = System.currentTimeMillis();

        filterChain.doFilter(servletRequest, servletResponse);

        long endTime = System.currentTimeMillis();
        System.out.println("time filter consume " + (endTime - startTime) + " ms");
        System.out.println("time filter end");
    }

    @Override
    public void destroy() {
        System.out.println("time filter init");
    }

    @Override
    public String getFilterName() {
        return "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
    }

    @Override
    public ServletContext getServletContext() {
        ServletContext sc = this.getServletContext();
        System.err.println(sc.getClass());
        List a = Arrays.asList("","123");
        return sc;
    }

    @Override
    public String getInitParameter(String s) {
        return "this is init param";
    }

    @Override
    public Enumeration<String> getInitParameterNames() {
        return null;
    }
}
