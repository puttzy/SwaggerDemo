package com.csg.putt.demo.swagger.controller;

import com.csg.putt.demo.swagger.responses.Responses;
import com.csg.putt.demo.swagger.obj.BookReview;
import com.csg.putt.demo.swagger.obj.Reviewer;
import com.wordnik.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static com.csg.putt.demo.swagger.responses.Responses.ok;

/**
 * Created by Dan on 3/16/2015.
 */

@RequestMapping("/review")
@Api(value = "review", basePath = "/review", description = "Book reviews", consumes = "application/json" , produces = "application/json")
@RestController
public class Review {


    @ApiOperation(value = "Used to add a review to a book"
            , notes = "When adding a review be sure the ISBN exists.  If the ISBN passed in is not found a 404 will be returned."
            , httpMethod = "POST"
            , produces = "application/json"
    )
    @ApiResponses({
            @ApiResponse(code = 201, message = "Successfully created the review"),
            @ApiResponse(code = 404, message = "Book Not Found"),
            @ApiResponse(code = 500, message = "Sadness arises from within as something bad happened but we're not gonna tell you what exactly")
    })
    @RequestMapping(value = "/{isbn}", method = RequestMethod.POST)
    public @ResponseBody ResponseEntity<Object> addReview(
            @ApiParam(value = "ISBN of the book to be reviewed", required = true) @PathVariable(value = "isbn") Long isbn ,
            @RequestBody BookReview review
    )   {
        if (isbn != 9780739346778L ){
            return new ResponseEntity<Object>(("ISBN Not Found Exception"), HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<Object>( HttpStatus.OK);
    }


    @ApiOperation(value = "Used to update a review to a book"
            , notes = "When adding a review be sure the ISBN exists.  If the pased in ISBN is not found a 404 will be returned." +
            "   for purposes of this demo only a few ISBNs are valid:  9780739346778"
            , httpMethod = "PUT"
            , produces = "application/json"
    )
    @ApiResponses({
            @ApiResponse(code = 201, message = "Successfully created the review"),
            @ApiResponse(code = 404, message = "Book Not Found"),
            @ApiResponse(code = 500, message = "Sadness arises from within as something bad happened but we're not gonna tell you what exactly")
    })
    @RequestMapping(value = "/{isbn}", method = RequestMethod.PUT)
    public @ResponseBody ResponseEntity<Object> updateReview(
            @ApiParam(value = "ISBN of the book to be reviewed", required = true) @PathVariable(value = "isbn") Long isbn ,
            @RequestBody BookReview review
    )   {
        if (isbn != 9780739346778L ){
            return new ResponseEntity<Object>(new Exception("ISBN Not Found Exception"), HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<Object>( HttpStatus.OK);
    }

    @ApiOperation(value = "Used to remove a review from a book"
            , notes = "In the real world this would have to have some kind of atuthentication / authorization tied to it, but for" +
            "   demo purposees this should show the desired socumentation.  "

    )
    @ApiResponses({
            @ApiResponse(code = 202, message = "Deleted"),
            @ApiResponse(code = 404, message = "Book Not Found"),
            @ApiResponse(code = 500, message = "Sadness arises from within as something bad happened but we're not gonna tell you what exactly")
    })
    @RequestMapping(value = "/{reviewId}", method = RequestMethod.DELETE)
    public @ResponseBody ResponseEntity<String> deleteReview(
            @ApiParam(value = "Id of the review to remove", required = true) @PathVariable(value = "reviewId") Long reviewId
    )   {
        if (reviewId == 1) {
            return Responses.ok();
        }
        return Responses.notFound();
    }

    @ApiOperation(value = "Find review(s) from a specific reviewer"
            , notes = " NOTES!!!"
            , httpMethod = "GET"
            , produces = "application/json"
            , response = BookReview.class
            , responseContainer = "List"
    )
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK", response = Reviewer.class),
            @ApiResponse(code = 404, message = "Reviewer Not Found"),
            @ApiResponse(code = 500, message = "Sadness arises from within as something bad happened but we're not gonna tell you what exactly")
    })
    @RequestMapping(value = "/findByReviewer/{reviewerId}", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<List<BookReview>> getReviewsFromReviewer(
            @ApiParam(value = "ID of the reviewer", required = true) @PathVariable(value = "reviewerId") Long reviewerId
    )   {
        List<BookReview> reviews = new ArrayList<BookReview>();

        return ok(reviews);
    }



}
