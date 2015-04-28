package com.csg.putt.demo.swagger.config;

import org.apache.logging.log4j.LogManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by Dan on 4/22/2015.
 */
@Configuration
public class ViewConfig{

    private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(ViewConfig.class.getName());
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
