package com.mycompany.app;

import algo.bookoop.BookAdult;
import algo.bookoop.BookBuilder;

/**
 * l3Assignment   
   key point:  0).Publication served as abstract class due to field isbn and publisher were immutable.
               1). programmer to interface(IContent)
 *             2). design pattern: decorator, builder, composition
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
