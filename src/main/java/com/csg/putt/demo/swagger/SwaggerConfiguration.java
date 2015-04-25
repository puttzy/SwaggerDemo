package com.csg.putt.demo.swagger;

/**
 * Created by Dan on 4/21/2015.
 */


import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.List;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

@EnableSwagger2
public class SwaggerConfiguration {

    public static final List<String> DEFAULT_INCLUDE_PATTERNS = Arrays.asList("^(?!/error|/internal/).*$");
    private static final String SWAGGER_GROUP = "";

    @Bean
    public Docket swaggerSpringMvcPlugin() {
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&7777");
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .forCodeGeneration(true)
                .select()

                .build();

        docket.globalResponseMessage(RequestMethod.GET, ImmutableList.of(new ResponseMessage(200, "Some global OK message", null)));
        docket.globalResponseMessage(RequestMethod.DELETE, ImmutableList.of(new ResponseMessage(200, "Some global OK message", null)));
        return docket;
    }

    private Predicate<String> paths() {
        return or(regex(".*putt.*"));
    }

/*
    public SwaggerSpringMvcPlugin swaggerPlugin(SpringSwaggerConfig springSwaggerConfig) {
        System.out.println("***********************88");
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
    */
}