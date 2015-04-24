package com.csg.putt.demo.azure.obj;


import com.mangofactory.swagger.plugin.EnableSwagger;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * Created by Dan on 3/16/2015.
 */
@EnableSwagger2
@ApiModel(value="Book Review Model", description="Sample model for the Sample model for the documentation")
public class BookReview {

    Integer rating;
    String review;
    Reviewer reviewer;

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Reviewer getReviewer() {
        return reviewer;
    }

    public void setReviewer(Reviewer reviewer) {
        this.reviewer = reviewer;
    }

    @ApiModelProperty(value = "Integer or star rating of the book", allowableValues = "1,2,3,4,5")
    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
