package com.example.springapplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class Controller {
        @RequestMapping("/api")
        public String Hello (){
            return "<h1>Hello From BridgeLabz!!</h1>";
        }
    }

