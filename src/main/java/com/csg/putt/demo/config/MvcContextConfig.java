package com.csg.putt.demo.config;

import com.csg.putt.demo.swagger.SwaggerConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
@ComponentScan(basePackages = { "com.csg.putt.demo.azure","com.csg.putt.demo.azure.controller" })
@Import(SwaggerConfiguration.class)
public class MvcContextConfig extends WebMvcConfigurerAdapter {

        private static final Logger logger = LoggerFactory.getLogger(MvcContextConfig.class);

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
        System.out.println("------------------- adding handler");
        registry.addResourceHandler("/api/").addResourceLocations("/static/swagger/");

    }

/*

    <mvc:resources mapping="/api/**" location="/static/swagger/" />

    <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
    <property name="prefix" value="/WEB-INF/pages/"/>
    <property name="suffix" value=".jsp"/>
    </bean>
*/


}

