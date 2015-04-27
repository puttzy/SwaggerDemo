package com.csg.putt.demo.swagger.service;

import com.csg.putt.demo.dao.BookDao;
import com.csg.putt.demo.swagger.obj.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Dan on 4/26/2015.
 */
@Service
public class BookService {

    @Autowired
    BookDao bookDao;

    public List<Book> getAllBooks(){
        return bookDao.getAllBooks();
    }


    public List<Book> findBooks(String title, String lastName, String firstName){
        return bookDao.findBooks(title, lastName, firstName);
    }

}
