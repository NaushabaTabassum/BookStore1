package com.example.BookStore.service;

import com.example.BookStore.model.Book;
import com.example.BookStore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements  BookService{

    @Autowired
    private BookRepository bookrepository;

public BookServiceImpl(BookRepository bookrepository){
    this.bookrepository=bookrepository;

}


    @Override
    public String saveBook(Book book) {
        bookrepository.save(book);
        return "Added book with id :"+book.getId();
    }

    @Override
    public List<Book> getBooks() {
        return bookrepository.findAll();
    }

    @Override
    public Optional<Book> getBook(int id) {
        return bookrepository.findById(id);
    }

    @Override
    public String deleteBook(int id) {
        bookrepository.deleteById(id);
        return "Book deleteted with id"+id;
    }
}
