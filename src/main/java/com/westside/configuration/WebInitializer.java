package com.westside.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by bkwak on 05/01/2017.
 */
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { WebConfig.class };
    }
    // RootConfig.class

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }
    // WebConfig.class

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}
