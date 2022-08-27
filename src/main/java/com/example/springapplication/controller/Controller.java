package com.example.springapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    public class Controller {
        @RequestMapping("/api")
        public String Hello() {
            return "<h1>Hello From BridgeLabz!!</h1>";
        }

        @GetMapping("/query")
        public String getUsers(@RequestParam(value = "name", defaultValue = "Swatika") String name) {
            return "Hello! " + name + " From BridgeLabz!!";
        }
    }

