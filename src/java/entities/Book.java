/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.util.logging.Logger;
import javax.inject.Inject;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import logging.Loggable;

/**
 *
 * @author Alex
 */
public class Book {
    @Inject
    private Logger logger;

    @NotNull
    private String title;
    @NotNull @Min(20)
    private Float price;
    @Size(max=200)
    private String description;
    private String number;


    // ---------------------------------------------------
    // Constructors, Getters and Setters
    // ---------------------------------------------------
    @Loggable
    public Book(String title, Float price, String description) {
	System.out.println("NEW BOOK: " + title + ", " + price + ", " + description + ", logger="+logger);
	this.title = title;
	this.price = price;
	this.description = description;
    }

    public String getTitle() {
	return title;
    }

    public void setTitle(String title) {
	this.title = title;
    }

    public Float getPrice() {
	return price;
    }

    public void setPrice(Float price) {
	this.price = price;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public String getNumber() {
	return number;
    }

    public void setNumber(String number) {
	this.number = number;
    }
    
    @Override
    public String toString() {
	return "Title=\"" + getTitle() + "\", Number=" + getNumber() + ", Desc=\"" + getDescription() 
		+ "\", Price=$"+getPrice();
    }
    
    
}
