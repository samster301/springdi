package com.samster.springdi.services;

import org.springframework.beans.factory.parsing.BeanComponentDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.beans.BeanProperty;
import java.beans.beancontext.BeanContext;
import java.beans.beancontext.BeanContextServices;

@Service("theservice")
public class MyServiceImpl implements MyService {
    @Override
    public String sayHello(){
        System.out.println("Inside the ");
        return "hello everyone";
    }
}
