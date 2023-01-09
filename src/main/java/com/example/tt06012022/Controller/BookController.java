package com.example.tt06012022.Controller;

import com.example.tt06012022.dto.BookRequest;
import com.example.tt06012022.model.Book;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping("/book")
public class BookController {
    private ConcurrentHashMap<String, Book> books; // biến book mang kiểu dữ liệu ConcurrentHashMap
    public BookController(){
        books = new ConcurrentHashMap<>();
        books.put("OX-13",new Book("2","Hieu","Dinh Minh Hieu",2002));
        books.put("abc",new Book("1","Hieu","Dinh Minh Hieu",2000));

    }

    @GetMapping("")
    public List<Book> getBooks(){
        return books.values().stream().toList();
    }

    @PostMapping
    public Book CreateNewBook(@RequestBody BookRequest bookRequest){
        String uuid = UUID.randomUUID().toString();
        Book newBook = new Book(uuid,bookRequest.title(),bookRequest.author(), bookRequest.year());
        books.put(uuid,newBook);
        return newBook;
    }
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable("id") String id){
        return books.get(id);
    }

    @PutMapping("/{id}")
    public Book updateBookById(@PathVariable("id") String id,@RequestBody BookRequest bookRequest){
        Book updateBook = new Book(id,bookRequest.title(),bookRequest.author(), bookRequest.year());
        books.put(id,updateBook);
        return updateBook;
    }

    @DeleteMapping(value ="/{id}")
    public Book removeBook(@PathVariable("id") String id){
        Book xoaBook = books.remove(id);
        return xoaBook;
    }
}













































