package com.example.myrestdemo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class TestController {

    private String test = "hello";

    @GetMapping("/test")
    public String testRest(){
        return test;
    }

    @PostMapping("add/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public String setRest(@PathVariable("id") int id){

        this.test = test;
        return test + id;
    }

    @PutMapping("/change")
    public String putRest(@RequestBody String string){

        test = string;

        return test;
    }

    @DeleteMapping("/del")
    public String delRest(){
        return test = null;
    }
}
