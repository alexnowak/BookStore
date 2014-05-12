/*
 * Copyright (c) 2014 by Alexander Nowak
 * To be used only with permission.
 */

package services;

import entities.Book;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.inject.Named;
import logging.Loggable;

/**
 * The BookService Using Dependency Injection and Interception
 * The interceptor binding @Loggable logs the method entry and exit 
 * if enabled.
 * 
 * @author Alexander Nowak
 */
@Loggable
@Named
public class BookService {
    @Inject
    private Logger logger;

    @Inject @ThirteenDigits
    private NumberGenerator numberGenerator;
    
    private String title, description;
private Float price;
private Book book;
    
    public String createBook() {
	book = new Book(title,price,description);
	book.setNumber(numberGenerator.generateNumber());
	return "customer.xhtml";	
	
    }
    
    public Book createBook(String title, Float price, String description) {
	logger.info("createBook() called");
	book = new Book(title,price,description);
	book.setNumber(numberGenerator.generateNumber());
	return book;	
    }
    
}
