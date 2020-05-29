package com.example.circuitbreakerbookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.circuitbreakerbookstore.service.BookstoreService;

@RestController
@RequestMapping
public class BookstoreController {
	
	@Autowired
	private BookstoreService bookStoreService;
	
	@GetMapping(value = "/recommended")
	public String readingList() {

		return bookStoreService.getReadingList();
	}
}
