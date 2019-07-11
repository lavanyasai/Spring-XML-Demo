package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main( String[] args ) {

        //Using ApplicationContext
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:src/beans.xml");
        Movie firstMovie = applicationContext.getBean("Movie A, Movie B", Movie.class);
        firstMovie.displayInformation();

        Movie secondMovie = applicationContext.getBean("Movie A, Movie B", Movie.class);
        secondMovie.displayInformation();

        if(firstMovie == secondMovie) {
            System.out.println("Equal");
        }
        else {
            System.out.println("Not Equal");
        }
    }
}
