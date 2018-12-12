package com.mycompany.app;

import algo.bookoop.BookAdult;
import algo.bookoop.BookBuilder;
import algo.exceptionself.MyException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

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

    public void doSomething() throws MyException{

        //try-with-resources
        File file = new File("./tmp.txt");
        try (FileInputStream inputStream = new FileInputStream(file)) {
            // use the inputStream to read a file

            int a = 0;
            int b = 1;
            int c = b/a;
        }
        catch (FileNotFoundException e) {
            System.out.println("doSomething  FileNotFoundException "+e);
        }
        catch (IOException e) {
            System.out.println("doSomething  IOException "+e);
        }


    }

    public static void main( String[] args )
    {

        App app = new App();

        try{
            app.doSomething();
        }
        catch (MyException e){

        }


        BookAdult pub = new BookAdult("ISBN", "oreil");
        BookBuilder.builderBook(pub);

        System.out.println( "Hello World!" );
    }
}
