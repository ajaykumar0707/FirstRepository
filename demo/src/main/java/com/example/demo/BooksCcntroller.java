package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksCcntroller {
	@GetMapping("/books") //similler to @RequestMapping
	public List<Book> getAllBooks()
	{
		
		return Arrays.asList(new Book(11,"oone","two"));
		
	}
	

}
