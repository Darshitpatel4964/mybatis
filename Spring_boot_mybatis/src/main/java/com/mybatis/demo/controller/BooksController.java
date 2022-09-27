package com.mybatis.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mybatis.demo.dto.RestDto;
import com.mybatis.demo.model.Books;
import com.mybatis.demo.service.BooksService;

/**
 * This is BooksController.java class for  project It is maintain all request
 * @author Darshit Patel
 */

@RestController
@RequestMapping("/api/books")
public class BooksController {

	@Autowired
	BooksService booksService; 

	@GetMapping("/all")
	public RestDto<List<Books>> getAll() {
		return new RestDto<List<Books>>(booksService.getAll()).setSuccessMessage("Books List");
	}

}