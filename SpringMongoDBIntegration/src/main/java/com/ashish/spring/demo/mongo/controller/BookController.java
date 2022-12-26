package com.ashish.spring.demo.mongo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashish.spring.demo.mongo.model.Book;
import com.ashish.spring.demo.mongo.repository.BookRepository;

@RestController
public class BookController {
	
	@Autowired
	private BookRepository repository;
	
	@PostMapping("/addBook")
	public String saveBook(@RequestBody Book book) {
		repository.save(book);
		return "Added book with Id: " + book.getId();
		
	}
	
	@GetMapping("/findAllBooks")
	public List<Book> getBooks() {		
		return repository.findAll();
		
	}
	
	@GetMapping("/findbookbyid/{id}")
	public Optional<Book> getBookById(@PathVariable int id){
		return repository.findById(id);		
	}
	
	@DeleteMapping("/deleteBooks/{id}")
	public String deleteBook(@PathVariable int id) {
		repository.deleteById(id);
		return "Book deleted with id:" +id;
		
	}

}
