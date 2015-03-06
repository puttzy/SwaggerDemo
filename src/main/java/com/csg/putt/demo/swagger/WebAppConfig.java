package com.csg.putt.demo.swagger;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

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
                .apiInfo(new ApiInfo("Swagger Demo API", "DEMO using the swagger for spring library", "http://cardinal.com.com", "dputt@cardinalsolutionsl.com", "Copyright CardinalSolutions.com", "http://CardinalSolutions.com"))
                .includePatterns(DEFAULT_INCLUDE_PATTERNS.toArray(new String[DEFAULT_INCLUDE_PATTERNS.size()]))
                .swaggerGroup(SWAGGER_GROUP)
                ;
    }


}