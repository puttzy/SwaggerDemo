package com.csg.putt.demo.swagger;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
@EnableSwagger
public class WebAppConfig {
    public static final List<String> DEFAULT_INCLUDE_PATTERNS = Arrays.asList("^(?!/error|/internal/).*$");
    private static final String SWAGGER_GROUP = "";

    @Bean
    public SwaggerSpringMvcPlugin swaggerPlugin(SpringSwaggerConfig springSwaggerConfig) {
        return new SwaggerSpringMvcPlugin(springSwaggerConfig)
                .apiInfo(new ApiInfo("Book BookReview Demo (Swagger + Spring MVC)",
                        "DEMO using the <a href='https://github.com/springdox/swagger-springmvc'>swagger for spring library.</a><br><br> " +
                         " This demo shows only the methods available and provides a way to click around and play with swagger.  " +
                         "  There is no functionality to this demo at all. ",
                        "http://cardinal.com",
                        "dputt@cardinalsolutions.com",
                        "Copyright CardinalSolutions.com",
                        "http://CardinalSolutions.com"))
                .includePatterns(DEFAULT_INCLUDE_PATTERNS.toArray(new String[DEFAULT_INCLUDE_PATTERNS.size()]))
                .useDefaultResponseMessages(false)
                .swaggerGroup(SWAGGER_GROUP)
                ;
    }


}