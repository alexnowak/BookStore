
import entities.Book;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import services.BookService;




/*
 * Copyright (c) 2014 by Alexander Nowak
 * To be used only with permission.
 */

/**
 *
 * @author Alexander Nowak
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Weld weld = new Weld();
	
	System.out.println("CWD: " + System.getProperty("user.dir"));
	
	WeldContainer container = weld.initialize();
	BookService bookService = container.instance().select(BookService.class).get();
	
	Book book = bookService.createBook("H2G2", 12.6f, "Geeky SiFi Book");
	System.out.println(book);
	weld.shutdown();
    }
    
}
