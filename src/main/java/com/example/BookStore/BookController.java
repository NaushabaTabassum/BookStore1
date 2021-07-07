package com.example.BookStore;

import com.example.BookStore.model.Book;
import com.example.BookStore.repository.BookRepository;
import com.example.BookStore.service.BookService;
import com.example.BookStore.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

@Autowired
 //private BookRepository bookrepository;
private BookService bookservice;


public BookController(BookService bookservice){
    this.bookservice=bookservice;
}


@PostMapping("/addBook")
    public String saveBook(@RequestBody Book book){
    //bookrepository.save(book);
    bookservice.saveBook(book);
    return "Added book with id :"+book.getId();
}

@GetMapping("/findAllBooks")
 public List<Book> getBooks(){
 //return bookrepository.findAll();
    return bookservice.getBooks();
}

@GetMapping("getBooks/{id}")
public Optional<Book> getBook(@PathVariable int id){
  //  return bookrepository.findById(id);
    return bookservice.getBook(id);
}

@DeleteMapping(value = "/delete/{id}")
public String deleteBook(@PathVariable int id){
//bookrepository.deleteById(id);
    bookservice.deleteBook(id);
return "book deleted with id: " +id;
}

}
