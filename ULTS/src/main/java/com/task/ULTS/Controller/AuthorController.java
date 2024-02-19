package com.task.ULTS.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task.ULTS.Entity.Author;
import com.task.ULTS.Service.AuthorService;

@RestController
@RequestMapping("/author")
public class AuthorController {

	@Autowired
	private AuthorService authorService;
	
	@GetMapping("/books")
	public ResponseEntity<List<Author>> findAuthorBooks(){
		
		List<Author> author= authorService.findAuthorBooks();
		return new ResponseEntity<>(author, HttpStatus.OK);
		
	}
}
