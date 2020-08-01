package com.joker.graphql.service.resolver;

import com.joker.graphql.model.Book;
import com.joker.graphql.model.BookInput;
import com.joker.graphql.service.BookService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookMutationResolver implements GraphQLMutationResolver {
    @Autowired
    private BookService bookService;

    public Book addBook(BookInput bookInput) {
        return bookService.addBook(bookInput.toBook());
    }
}
