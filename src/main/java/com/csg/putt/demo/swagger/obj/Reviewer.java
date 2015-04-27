package com.csg.putt.demo.swagger.obj;


import lombok.Getter;
import lombok.Setter;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by Dan on 3/16/2015.
 */
@EnableSwagger2
public class Reviewer {

    @Getter @Setter String user;
    @Getter @Setter String about;
    @Getter @Setter Integer userId;

}
