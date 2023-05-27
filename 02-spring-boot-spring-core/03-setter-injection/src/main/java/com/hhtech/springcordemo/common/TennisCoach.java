package com.hhtech.springcordemo.common;

public class TennisCoach implements  Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley (Tennis coach)";
    }
}
