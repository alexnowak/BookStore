/*
 * Copyright (c) 2014 by Alexander Nowak
 * To be used only with permission.
 */

package services;

import entities.Book;
import javax.inject.Inject;
import logging.Loggable;

/**
 * The BookService Using Dependency Injection and Interception
 * The interceptor binding @Loggable logs the method entry and exit 
 * if enabled.
 * 
 * @author Alexander Nowak
 */
@Loggable
public class BookService {
    @Inject @ThirteenDigits
    private NumberGenerator numberGenerator;
    
    public Book createBook(String title, Float price, String description) {
	Book book = new Book(title,price,description);
	book.setNumber(numberGenerator.generateNumber());
	return book;	
    }
    
}
