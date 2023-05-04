package org.example;

public class RunService {

    public int startRun(int chosenPair,Pair firstPair,Pair secondPair,Pair thirdPair){
        System.out.println("\nLet's start the run!!!");
        for (int cycle = 1;cycle <= 4;cycle++){
            firstPair.changePairSpeed();
            secondPair.changePairSpeed();
            thirdPair.changePairSpeed();

            System.out.println("------------------");
            System.out.println("Cycle: " + cycle);
//            System.out.println("1 - " + firstPair.getTotalSpeed());
//            System.out.println("2 - " + secondPair.getTotalSpeed());
//            System.out.println("3 - " + thirdPair.getTotalSpeed());
            findCycleWinner(firstPair,secondPair,thirdPair);
        }
        System.out.println("------------------");
        System.out.println("Cycle: 5");
        int winner = findCycleWinner(firstPair,secondPair,thirdPair);
        System.out.println("\nPair number " + winner + " is a winner!");
        return winner;
    }

    private int findCycleWinner(Pair firstPair,Pair secondPair,Pair thirdPair){
        int maxSpeed = Math.max(Math.max(firstPair.getTotalSpeed(),secondPair.getTotalSpeed()),thirdPair.getTotalSpeed());
        if(firstPair.getTotalSpeed() == maxSpeed
                && firstPair.getTotalSpeed() != secondPair.getTotalSpeed()
                && firstPair.getTotalSpeed() != thirdPair.getTotalSpeed()) {
            System.out.println("First pair win!");
            return 1;
        } else if (secondPair.getTotalSpeed() == maxSpeed
                && secondPair.getTotalSpeed() != firstPair.getTotalSpeed()
                && secondPair.getTotalSpeed() != thirdPair.getTotalSpeed()){
            System.out.println("Second pair win!");
            return 2;
        } else if (thirdPair.getTotalSpeed() == maxSpeed
                && thirdPair.getTotalSpeed() != firstPair.getTotalSpeed()
                && thirdPair.getTotalSpeed() != secondPair.getTotalSpeed()) {
            System.out.println("Third pair win!");
            return 3;
        } else {
            System.out.println("Draw!");
            return 0;
        }
    }
}
