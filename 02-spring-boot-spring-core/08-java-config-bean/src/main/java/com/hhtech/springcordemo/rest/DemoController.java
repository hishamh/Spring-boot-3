package com.hhtech.springcordemo.rest;


import com.hhtech.springcordemo.common.Coach;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach mycoach;

    @Autowired
    public DemoController(@Qualifier("Hishamm") Coach mycoach)
    {
        System.out.println("in constructor: "+getClass().getSimpleName());
        this.mycoach = mycoach;

    }

    @GetMapping("/Dailyworkout")
    public String getDailyWorkout(){
        return mycoach.getDailyWorkout();
    }



}
