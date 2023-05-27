package com.hhtech.springcordemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach mycoach;

    @Autowired
    public DemoController(Coach mycoach){
        this.mycoach = mycoach;
    }

    @GetMapping("/Dailyworkout")
    public String getDailyWorkout(){
        return mycoach.getDailyWorkout();
    }

}
