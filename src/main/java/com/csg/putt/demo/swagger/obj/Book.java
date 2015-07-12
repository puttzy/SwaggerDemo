package com.csg.putt.demo.swagger.obj;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

/**
 * Created by Dan on 3/18/2015.
 */

@ApiModel(value="Model For the book", description="Basic properties of a book")
public class Book {


    private String isbn;
    private String title;
    private String authorLastName;
    private String authorFirstName;
    private Integer publishYear;
    private Integer bookid;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public Integer getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(Integer publishYear) {
        this.publishYear = publishYear;
    }


    public Integer getBookid() {
        return bookid;
    }


    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }



    public Book(){

    }

    public Book(String isbn, String title, String authorLastName, String authorFirstName, Integer integer, Integer integer1) {
        this.isbn = isbn;
        this.title = title;
        this.authorLastName = authorLastName;
        this.authorFirstName = authorFirstName;
        this.publishYear = integer;
        this.bookid = integer1;

    }
}
