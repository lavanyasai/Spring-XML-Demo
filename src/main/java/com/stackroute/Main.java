package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Main
{
    public static void main( String[] args ) {

        //Using BeanFactory
        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("src/beans.xml"));
        Movie movie = beanFactory.getBean("movie", Movie.class);
        movie.displayInformation();

        //Using BeanDefinitionRegistry and BeanDefinitionReader
        DefaultListableBeanFactory beanDefinitionRegistry = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
        xmlBeanDefinitionReader.loadBeanDefinitions(new FileSystemResource("src/beans.xml"));
        movie = beanDefinitionRegistry.getBean(Movie.class);
        movie.displayInformation();

        //Using ApplicationContext
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:src/beans.xml");
        movie = applicationContext.getBean("movie", Movie.class);
        movie.displayInformation();
    }
}
