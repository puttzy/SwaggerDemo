package com.csg.putt.demo.swagger.obj;


import com.wordnik.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * Created by Dan on 3/16/2015.
 */
@EnableSwagger2
@ApiModel(value="Book Review Model", description="Sample model for the Sample model for the documentation")
public class BookReview {

    @Getter @Setter Integer rating;
    @Getter @Setter String review;
    @Getter @Setter Reviewer reviewer;
}
