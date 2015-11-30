package com.wawoo.controller;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.wawoo.service.BookService;

@RestController
@RequestMapping("/book")
public class BookTest {

	private static final Log logger = LogFactory.getLog(BookTest.class);

	@Resource(name = "BookServiceImpl")
	private BookService bookService;

	public BookService getBookService() {
		return bookService;
	}

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

	@RequestMapping(value = { "add" }, method = { RequestMethod.POST })
	public String addBook(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		
		//test for github
		return "add test";
	}
}
