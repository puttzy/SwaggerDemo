package com.csg.putt.demo.swagger.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by Dan on 4/22/2015.
 */
@Configuration
public class ViewConfig{
    private static final Logger logger =  LoggerFactory.getLogger(ViewConfig.class);
    @Bean
    public ViewResolver viewResolver() {

        logger.info("ViewConfiguration viewResolver()");
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setOrder(1);
        viewResolver.setPrefix("/WEB-INF/pages/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
}
