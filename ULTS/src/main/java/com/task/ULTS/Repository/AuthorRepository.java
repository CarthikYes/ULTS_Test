package com.task.ULTS.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.task.ULTS.Entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long>{
  
	@Query("SELECT a FROM Author a WHERE SIZE(a.books) > 3")
	List<Author> findAuthorBooks();
}
