package com.example.manageemployee.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses(){
        return new Class[]{SpringMVCConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses(){
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings(){
        return new String[]{"/"};
    }
}
