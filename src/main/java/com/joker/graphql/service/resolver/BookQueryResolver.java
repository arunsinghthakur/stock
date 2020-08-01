package com.joker.graphql.service.resolver;

import com.joker.graphql.model.Book;
import com.joker.graphql.service.BookService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookQueryResolver implements GraphQLQueryResolver {
    @Autowired
    private BookService bookService;

    public List<Book> allBooks() {
        return bookService.getAllBooks();
    }

    public Book getBookById(String isbn) {return bookService.getBookById(isbn);}
}
