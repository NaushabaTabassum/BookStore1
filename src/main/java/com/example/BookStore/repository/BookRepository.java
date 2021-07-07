package com.example.BookStore.repository;

import com.example.BookStore.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer> {

    
}
