package com.csg.putt.demo.swagger.config;

import com.csg.putt.demo.swagger.config.swagger.SwaggerConfiguration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Dan on 4/22/2015.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.csg.putt.demo.*", "com.csg.putt.demo.swagger.controller"})
@Import(SwaggerConfiguration.class)
public class MvcContextConfig extends WebMvcConfigurerAdapter {

        private static final Logger logger = LogManager.getLogger(WebMvcConfigurerAdapter.class.getName());


    /* (non-Javadoc)
         * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#configureDefaultServletHandling(org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer)
         */
        @Override
        public void configureDefaultServletHandling(final DefaultServletHandlerConfigurer configurer) {
            logger.info("WebMvcContextConfiguration: configureDefaultServletHandling Method");
            configurer.enable();
        }


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        logger.debug("MY HANDLER ADDED");
        registry.addResourceHandler("/api/").addResourceLocations("/static/swagger/");

    }

}

