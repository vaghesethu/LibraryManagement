package com.library.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.library.app.bean.BookModel;
import com.library.app.dao.BookRepo;

@Controller
public class LibraryController {
	String Id;
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@Autowired
	BookRepo repo;
	
	@RequestMapping("/saveBook")
	public String save(BookModel book) {
		repo.save(book);
		return "home.jsp";
	}

	@RequestMapping("/editBook")
	public String edit(@RequestParam String bookId,BookModel book) {
		if(repo.existsById(bookId))
		{
			Id=bookId;
			repo.delete(book);
			return "update.jsp";
		}
		return "home.jsp";
	}
	@RequestMapping("/updateBook")
	public String update(BookModel book) {
		book.setBookId(Id);
		repo.save(book);
		return "home.jsp";
	}
	
	@RequestMapping("/deleteBook")
	public String delete(@RequestParam String bookId,BookModel book) {
		if(repo.existsById(bookId))
		{
			repo.delete(book);
			return "delete.jsp";
		}
		return "home.jsp";
	}
	@RequestMapping("/getByType")
	@ResponseBody
	public String getByType(@RequestParam String genre) {
		return repo.findByGenre( genre).toString();
	}
	@RequestMapping("/getBooks")
	@ResponseBody
	public String getBooks() {
		return repo.findAll().toString();
	}
}
