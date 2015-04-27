package com.csg.putt.demo.swagger.controller;

import com.csg.putt.demo.swagger.obj.Book;
import com.csg.putt.demo.swagger.service.BookService;
import com.wordnik.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


import static org.springframework.http.MediaType.*;

/**
 * Created by Dan on 3/18/2015.
 */

@Api(value = "Discover", basePath = "/discover", description = "Helps discover books based on review criterea", consumes = "application/json" , produces = "application/json")
@RequestMapping(value = "/discover", produces = {APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE})
@RestController
public class Discover {

    @Autowired
    BookService bookService;

    @ApiOperation(value = "Using any variety of optional parameters this will help discover books meeting critereo"
            , notes = "This will enable a user to search for book based on a number of different optional parameters"
            , httpMethod = "GET"
            , produces = "application/json"
            , consumes = "application/json"
            , response = Book.class
            , responseContainer = "List"
    )
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK", response = Book.class),
            @ApiResponse(code = 404, message = "No matching books found"),
            @ApiResponse(code = 500, message = "Sadness arises from within as something bad happened but we're not gonna tell you what exactly")
    })
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<List<Book>> addReview(
            //@ApiParam(value = "Minimum rating of books to find", required = false) @RequestParam(value="minRating", required=false) Integer minRating,
            //@ApiParam(value = "Maximum rating of books to find", required = false) @RequestParam(value="maxRating", required=false) Integer maxRating,
            @ApiParam(value = "Authors Last Name starts with", required = false) @RequestParam(value="lastName", required=false) String lastName,
            @ApiParam(value = "Authors First Name starts with", required = false) @RequestParam(value="firstName", required=false) String firstName,
            @ApiParam(value = "Title Contains this string anywhere", required = false) @RequestParam(value="title", required=false) String title
    )   {

        //List myList = bookService.getAllBooks();
        List myList = bookService.findBooks(title, lastName, firstName);

        return new ResponseEntity<List<Book>>(myList, HttpStatus.OK);
    }
}
