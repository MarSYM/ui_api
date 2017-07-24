package com.angular.angular;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/book")
public class Controller {
	Book book = new Book();
	List<Book> listBook = new ArrayList<Book>();
	
	@RequestMapping(value = "/print/{name_book}", method = RequestMethod.GET)
	public List<Book> setBook(@PathVariable String name_book){
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaa");
		book.setZzz(name_book);
		book.setXxx(100);
		listBook.add(book);
//		return "Book name is "+book.getName();
		return listBook;
	}
}
