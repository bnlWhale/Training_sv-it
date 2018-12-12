package com.mycompany.app;

import algo.bookoop.BookAdult;
import algo.bookoop.BookBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        BookAdult pub = new BookAdult("ISBN", "oreil");
        BookBuilder.builderBook(pub);

        System.out.println( "Hello World!" );
    }
}
