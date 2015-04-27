package com.csg.putt.demo.dao;

import com.csg.putt.demo.swagger.obj.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dan on 4/26/2015.
 */
@Repository
public class BookDao {

    private static ArrayList<Book> dbBooks = null;


    public BookDao(){

        if (dbBooks == null) {
            dbBooks = new ArrayList<Book>();
            dbBooks.add(new Book("9780739346778", "Under and Alone", "Queen", "William", new Integer(2005), new Integer(dbBooks.size())));
            dbBooks.add(new Book("9781612130286", "Fifty Shades of grey", "James", "E. L.", new Integer(2011), new Integer(dbBooks.size())));
            dbBooks.add(new Book("9781929132140", "Everyone Poops", "Gomi", "Tarō", new Integer(2011), new Integer(dbBooks.size())));
            dbBooks.add(new Book("1556610408", "Anybody Can Be Cool-- But Awesome Takes Practice ", "Peterson", "Lorraine", new Integer(1988), new Integer(dbBooks.size())));
        }
    }

    public List<Book> getAllBooks(){
        return dbBooks;
    }

    public List<Book> findBooks(String title, String lastName, String firstName){
        List<Book> matchingBooks = new ArrayList<Book>();
        for (Book book : dbBooks){
            if (title != null){
                if (! book.getTitle().startsWith(title)){
                    continue;
                }
            }
            if (lastName != null){
                if (! book.getAuthorLastName().startsWith(lastName)){
                    continue;
                }
            }
            if (firstName != null){
                if (! book.getAuthorFirstName().startsWith(firstName)){
                    continue;
                }
            }
            matchingBooks.add(book);
        }
        return matchingBooks;
    }

}
