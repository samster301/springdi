package com.samster.springdi.controllers;

import com.samster.springdi.services.MyService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyController  {

    private final MyService myService;

    public MyController(@Qualifier("theservice") MyService myService) {
        this.myService = myService;
    }

    public String sayHello(){
        return myService.sayHello();
    }
}
