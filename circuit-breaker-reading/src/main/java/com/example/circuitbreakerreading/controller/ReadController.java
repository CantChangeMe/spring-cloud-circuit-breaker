package com.example.circuitbreakerreading.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.circuitbreakerreading.service.BookService;

@RestController
@RequestMapping
public class ReadController {

	@Autowired
	private BookService bookService;

	@GetMapping("/to-read")
	public String toRead() {
		return bookService.readingList();
	}
}
