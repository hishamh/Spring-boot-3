package com.hhtech.springcordemo.common;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



public class SwimCoach  implements  Coach{

    public SwimCoach(){
        System.out.println("In constructor "+getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkout() {
        return "Swimg for 20 minutes without stop";
    }
}
