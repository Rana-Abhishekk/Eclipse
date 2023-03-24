package com.Book.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Book.entity.Book;
import com.Book.repository.BookRepo;

@Service
public class BookService {
    @Autowired
	BookRepo bookRepo;

	public ResponseEntity<Book> getBookById(Integer id) {
		Optional<Book> bookOptional = bookRepo.findByBookId(id);
		if(bookOptional.isPresent()) {
			Book book = bookOptional.get();
			return ResponseEntity.status(HttpStatus.OK).body(book);
		}else {
			return (ResponseEntity<Book>) ResponseEntity.status(HttpStatus.BAD_REQUEST);
		}
		
	
		
	}

	public List<Book> getBookByIdForUser(Integer id) {
		
		List<Book> lis = bookRepo.findAllBookByUserId(id);
		
		
		return lis;
		
		
	}

	public void addBookToDB(Book book) {
		// TODO Auto-generated method stub
		bookRepo.save(book);
		
	}
    
    


	
}
