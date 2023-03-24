package com.Book.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Book.entity.Book;
import com.Book.service.BookService;

@RestController
@RequestMapping("book")
public class BookController {
    @Autowired
	BookService bookService;
	@GetMapping("fetch/{id}")
	ResponseEntity<Book> getBookById(@PathVariable Integer id){
		
		return bookService.getBookById(id);
		
		
	}
	
	@GetMapping("user/{id}")
	List<String> getBookByIdForUser(@PathVariable Integer id){
		String[] arr = new String[] {"A","b","c"};
		List<String> lis = Arrays.asList(arr);
		return lis;
//		return bookService.getBookByIdForUser(id);
		
	}
	
	@PostMapping("/add")
	public void addBook(@RequestBody Book book) {
		bookService.addBookToDB(book);
	}
	
	
	
	
}
