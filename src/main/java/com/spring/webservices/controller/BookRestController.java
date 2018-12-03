package com.spring.webservices.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.webservices.model.Book;

@RestController
@RequestMapping("/mybooks")
public class BookRestController {

	@GetMapping("/books")
	public List<Book> getBook() {
		List<Book> list=new ArrayList<>();
		Book b=new Book();
		b.setName("Harry Potter");
		b.setAuthor("J.K Rowling");
		b.setId(111);
		
		Book b1=new Book();
		b1.setName("Harry Potter");
		b1.setAuthor("J.K Rowling");
		b1.setId(222);
		list.add(b1);list.add(b);
		
		return list;
	}
	
	
}
