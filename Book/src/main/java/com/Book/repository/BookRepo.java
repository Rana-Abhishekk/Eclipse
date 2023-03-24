package com.Book.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Book.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

	

	@Query(value = "SELECT * FROM book_manage.book_entity Where user_id =:q", nativeQuery = true)
	List<Book> findAllBookByUserId(@Param("q") Integer userId);

	Optional<Book> findByBookId(Integer id);

}
