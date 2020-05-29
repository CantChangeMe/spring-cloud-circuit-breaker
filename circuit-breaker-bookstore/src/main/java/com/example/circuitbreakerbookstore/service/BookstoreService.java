package com.example.circuitbreakerbookstore.service;

import org.springframework.stereotype.Service;

@Service
public class BookstoreService {

	public String getReadingList() {

		return "Spring in Action (Manning), Cloud Native Java (O'Reilly), Learning Spring Boot (Packt)";
	}

}
