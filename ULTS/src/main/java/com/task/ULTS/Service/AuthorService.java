package com.task.ULTS.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.ULTS.Entity.Author;
import com.task.ULTS.Repository.AuthorRepository;

@Service
public class AuthorService {

	@Autowired
	private AuthorRepository authorRepository;
	
	
	public List<Author> findAuthorBooks(){
		return authorRepository.findAuthorBooks();
		
	}
}
