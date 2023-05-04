package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    User user(){
        return new User("Sab1maru",1000);
    }

    @Bean
    RacingService racingService(){
        return new RacingService();
    }

    @Bean
    RunService runService(){
        return new RunService();
    }

    @Bean
    @Scope("prototype")
    Horse firstHorse(){
        return new Horse("Jessica");
    }

    @Bean
    @Scope("prototype")
    Horse secondHorse(){
        return new Horse("Jack");
    }

    @Bean
    @Scope("prototype")
    Horse thirdHorse(){
        return new Horse("Polly");
    }

    @Bean
    @Scope("prototype")
    Rider firstRider(){
        return new Rider("John");
    }

    @Bean
    @Scope("prototype")
    Rider secondRider(){
        return new Rider("Nick");
    }

    @Bean
    @Scope("prototype")
    Rider thirdRider(){
        return new Rider("Ben");
    }

    @Bean
    @Scope("prototype")
    Pair firstPair(){
        return new Pair(firstHorse(),firstRider());
    }

    @Bean
    @Scope("prototype")
    Pair secondPair(){
        return new Pair(secondHorse(),secondRider());
    }

    @Bean
    @Scope("prototype")
    Pair thirdPair(){
        return new Pair(thirdHorse(),thirdRider());
    }
}
