package com.example.BookStore.service;

import com.example.BookStore.model.Book;
import java.util.Optional;
import java.util.List;

public interface BookService {

   public String saveBook(Book book) ;
   public List<Book> getBooks();
   public Optional<Book> getBook(int id);
public String deleteBook(int id);

}
