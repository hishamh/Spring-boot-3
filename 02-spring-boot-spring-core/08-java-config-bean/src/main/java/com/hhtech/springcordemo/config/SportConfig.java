package com.hhtech.springcordemo.config;

import com.hhtech.springcordemo.common.Coach;
import com.hhtech.springcordemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("Hishamm")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
