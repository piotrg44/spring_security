package pl.giczewski.spring_security;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    List<Book> books = new ArrayList<>();

    @GetMapping("/books")
    public List<Book> returnAllBooks(){
        return books;
    }

    @PostMapping("/books")
    public boolean addBook(@RequestBody Book book){
        return books.add(book);
    }

    @DeleteMapping("/books")
    public Book removeBook(@RequestParam int index){
        return books.remove(index);
    }



}
