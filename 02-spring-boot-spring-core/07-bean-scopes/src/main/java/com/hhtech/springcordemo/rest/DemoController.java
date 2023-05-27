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
    private Coach anotherCoach;

    @Autowired


    public DemoController
            (@Qualifier("cricketCoach") Coach mycoach,
             @Qualifier("cricketCoach") Coach anotherCoach){
        System.out.println("in constructor: "+getClass().getSimpleName());
        this.mycoach = mycoach;
        this.anotherCoach = anotherCoach;
    }

    @GetMapping("/Dailyworkout")
    public String getDailyWorkout(){
        return mycoach.getDailyWorkout();
    }


    @GetMapping("/check")
    public String check(){
        return "comparing beans : myCoach == anotherCoach "+ (mycoach==anotherCoach);
    }

}
