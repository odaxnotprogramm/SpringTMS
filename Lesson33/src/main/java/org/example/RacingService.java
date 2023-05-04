package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class RacingService {

    public void startRace(User user){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                AppConfig.class
        );

        Pair firstPair = context.getBean("firstPair",Pair.class);
        Pair secondPair = context.getBean("secondPair",Pair.class);
        Pair thirdPair = context.getBean("thirdPair",Pair.class);

        greeting(user);
        int chosenPair = choosePair();
        int userBet = chooseBet();
        showPairInfo(firstPair);
        showPairInfo(secondPair);
        showPairInfo(thirdPair);

        RunService runService = context.getBean("runService",RunService.class);
        int winner = runService.startRun(chosenPair,firstPair,secondPair,thirdPair);

        if (chosenPair == winner) {
            System.out.println("Congratulation, you win " + userBet + "$!");
            user.setCash(user.getCash() + userBet);
        } else {
            System.out.println("Loser, you lost " + userBet + "$!");
            user.setCash(user.getCash() - userBet);
        }
    }

    private void greeting(User user){
        System.out.println("-------------------");
        System.out.println("  User: " + user.getName());
        System.out.println("  Your cash: " + user.getCash());
        System.out.println("-------------------");
    }

    private int choosePair(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nChoose pair to bet(1,2,3): ");
        int chosenPair = scanner.nextInt();
        System.out.println("Your choice is: " + chosenPair);
        return chosenPair;
    }

    private int chooseBet(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter your bet: ");
        int bet = scanner.nextInt();
        System.out.println("Your bet is: " + bet);
        return bet;
    }

    private void showPairInfo(Pair pair){
        System.out.println("\nHorse name: " + pair.getHorse().getName());
        System.out.println("Rider name: " + pair.getRider().getName());
        System.out.println("Pair total speed: " + pair.getTotalSpeed());
        System.out.println("------------------------");
    }
}
