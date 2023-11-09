package com.samster.springdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class MyServiceAnotherImpl implements MyService{

    @Override
    public String sayHello() {
        return "Hello from MyServiceAnotherImpl";
    }
}
