package com.wawoo.serviceimpl;

import java.util.List;

import com.wawoo.dao.BookDao;
import com.wawoo.entity.Book;
import com.wawoo.service.BookService;
/**
 * Description:
 * <br/>利嫋: <a href="http://www.crazyit.org">決髄Java選男</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class BookServiceImpl implements BookService
{
	private BookDao bookDao;
	
	public void setBookDao(BookDao bookDao)
	{
		this.bookDao = bookDao;
	}

	public int addBook(Book book)
	{
		return (Integer) bookDao.save(book);
	}

	public List<Book> getAllBooks()
	{
		return bookDao.findAll(Book.class);
	}

	public void deleteBook(int id)
	{
		bookDao.delete(Book.class, id);
	}
}
