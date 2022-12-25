package com.ashish.spring.demo.mongo.repository;

import org.springframework.data.repository.CrudRepository;

import com.ashish.spring.demo.mongo.model.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{

}
