package com.library.app.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.library.app.bean.BookModel;

public interface BookRepo extends CrudRepository<BookModel, String>{

	List<BookModel> findByGenre(String genre);

}
