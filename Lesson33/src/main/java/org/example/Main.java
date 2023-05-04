package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                AppConfig.class
        );

        User user = context.getBean("user",User.class);

        RacingService racingService = context.getBean("racingService",RacingService.class);

        while(user.getCash() > 0) {
            racingService.startRace(user);
        }
    }
}