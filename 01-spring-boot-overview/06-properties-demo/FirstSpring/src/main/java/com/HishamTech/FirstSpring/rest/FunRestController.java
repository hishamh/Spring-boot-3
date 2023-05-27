package com.HishamTech.FirstSpring.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController
{
    //injecting properties
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    //expose "/" that return Hello World
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World";
    }


    //expsoing infomratoin
    @GetMapping("/teaminfo")
    public String teamInfo(){
        return teamName + " The ochsh is "+ coachName;
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
