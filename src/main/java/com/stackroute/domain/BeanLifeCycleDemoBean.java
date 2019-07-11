package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleDemoBean implements InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Properties are set");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy");
    }

    public void customInit() {
        System.out.println("Initialization");
    }

    public void customDestroy() {
        System.out.println("Destroyed");
    }
}
