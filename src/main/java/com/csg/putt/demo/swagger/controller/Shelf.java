package com.csg.putt.demo.swagger.controller;

import com.csg.putt.demo.swagger.obj.Book;
import com.csg.putt.demo.swagger.service.BookService;
import com.wordnik.swagger.annotations.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 * Created by dputt on 4/27/2015.
 */
@RestController
@Api(value = "Shelf", basePath = "/shelf", description = "Adds or removes books from a users shelf", consumes = "application/json" , produces = "application/json")
@RequestMapping(value = "/shelf", produces = {APPLICATION_JSON_VALUE})
public class Shelf {

    private static final Logger logger = LogManager.getLogger(Shelf.class.getName());

    @Autowired
    BookService bookService;

    @ApiOperation(value = "Adds a book to a users shelf"
            , notes = "Notes: Adds a book to a users shelf"
            , httpMethod = "POST"
            , produces = "application/json"
            , consumes = "application/json"
            , response = Book.class

    )
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK", response = Book.class),
            @ApiResponse(code = 500, message = "Sadness arises from within as something bad happened but we're not gonna tell you what exactly")
    })
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json" , consumes = "application/json")
    public @ResponseBody
    ResponseEntity<Book> addBook(
            @ApiParam(value = "Book - and all of it's details", required = true) @RequestBody  Book book
    )   {
        logger.debug("book = " + book);
        return new ResponseEntity<Book>(bookService.addBook(book), HttpStatus.OK);

    }

}
