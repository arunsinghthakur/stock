package com.joker.graphql.service;

import com.joker.graphql.model.Book;
import com.joker.graphql.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book addBook(String isbn, String name, String author) {
        return bookRepository.save(new Book(isbn, name, author));
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @PostConstruct
    public void dummyRecords() {
        bookRepository.save(new Book("1233","JAVA","Gosling"));
    }
}
