package com.csg.putt.demo.swagger.config.swagger;

/**
 * Created by Dan on 4/21/2015.
 */


import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.service.ApiInfo;
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
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .forCodeGeneration(true)
                .select()
                .build();

        docket.globalResponseMessage(RequestMethod.GET, ImmutableList.of(new ResponseMessage(200, "All is good", null)));
        docket.globalResponseMessage(RequestMethod.DELETE, ImmutableList.of(new ResponseMessage(200, "All is good", null)));
        docket.globalResponseMessage(RequestMethod.PUT, ImmutableList.of(new ResponseMessage(200, "All is good", null)));
        docket.globalResponseMessage(RequestMethod.POST, ImmutableList.of(new ResponseMessage(200, "All is good", null)));
        docket.apiInfo(createAPIInfo());
        return docket;
    }

    private Predicate<String> paths() {
        return or(regex(".*putt.*"));
    }

    private ApiInfo createAPIInfo(){
        return new ApiInfo("Book Review Demo (Swagger + Spring MVC)",
                        "DEMO using the <a href='https://github.com/springdox/swagger-springmvc'>swagger for spring library.</a><br><br> " +
                                " This demo shows only the methods available and provides a way to click around and play with swagger.  " +
                                "  There is no functionality to this demo at all.  "+  "   <br>For purposes of this demo only a few ISBNs are valid:" +
                                " <ul>" +
                                "<li>  9780739346778 " +
                                "<li>  9781612130286 " +
                                "<li>  9781929132140 " +
                                "<li>  1556610408 " +
                                "</ul>",
                        "1.0",
                        "http://cardinal.com",
                        "dputt@cardinalsolutions.com",
                        "Copyright CardinalSolutions.com",
                        "http://CardinalSolutions.com");

    }



}