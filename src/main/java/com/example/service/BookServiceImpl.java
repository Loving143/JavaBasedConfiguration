package com.example.service;

import java.util.Arrays;
import java.util.List;

import com.example.beans.Book;

public class BookServiceImpl implements BookService {

	  @Override
	    public List<Book> getAllBooks() {
	        return Arrays.asList(
	            new Book("1984", "George Orwell"),
	            new Book("To Kill a Mockingbird", "Harper Lee")
	        );
	    }
	
}
