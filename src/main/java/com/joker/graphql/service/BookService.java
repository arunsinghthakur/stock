package com.joker.graphql.service;

import com.joker.graphql.model.Book;
import com.joker.graphql.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @PostConstruct
    public void dummyRecords() {
        bookRepository.save(new Book(UUID.randomUUID().toString(),"1", "JAVA", "Gosling"));
    }

    public Book getBookById(String id) {
        return bookRepository.findById(id).get();
    }
}
