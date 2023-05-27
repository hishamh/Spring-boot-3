package com.HishamTech.FirstSpring.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController
{
    //expose "/" that return Hello World

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World";
    }


    //expose a new endpoint for "workout"
     @GetMapping("/workout")
    public String getDailyWorkout(){
        return  "run 5 miles";
     }

     @GetMapping("/fortune")
    public String fortune(){
        return "You have 50 Million";
     }
}
