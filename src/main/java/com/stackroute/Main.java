package com.stackroute;

import com.stackroute.domain.BeanLifeCycleDemoBean;
import com.stackroute.domain.BeanPostProcessorDemoBean;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main( String[] args ) throws Exception {

        //Using ApplicationContext
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:src/beans.xml");

        BeanLifeCycleDemoBean beanLifeCycleDemoBean = applicationContext.getBean("beanLifeCycle", BeanLifeCycleDemoBean.class);

        Movie firstMovie = applicationContext.getBean("firstMovie", Movie.class);
        firstMovie.displayInformation();

        BeanPostProcessorDemoBean beanPostProcessorDemoBean = applicationContext.getBean("beanPostProcessorLifeCycle", BeanPostProcessorDemoBean.class);

        applicationContext.close();
    }
}
