package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice Penalty shoot for 15 minutes ... ";
    }
}
