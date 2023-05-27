package com.hhtech.springcordemo.common;

public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k (Track coach)";
    }
}
