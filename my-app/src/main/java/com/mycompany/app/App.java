package com.mycompany.app;

import algo.bookoop.BookAdult;
import algo.bookoop.BookBuilder;

/**
 * l3Assignment   
   key point:  0).Publication served as abstract class due to field isbn and publisher were immutable.
               1). programmer to interface(IContent)
 *             2). design pattern: decorator, builder, composition
 
     ran app and output =>
      this book's content is:
      html_table_of_content
      Chapter 0
       section 0
         paragraph 0
         paragraph 1
       section 1
         paragraph 2
         paragraph 3
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
