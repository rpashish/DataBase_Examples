package com.ashish.spring.demo.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.ashish.spring.demo.mongo.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer>{

}
