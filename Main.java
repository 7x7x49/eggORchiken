package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ChickenOpponent chicken = new ChickenOpponent();
        EggOpponent egg = new EggOpponent();
        chicken.start();
        egg.start();
        egg.join();
        if (chicken.isAlive()) {
            chicken.join();
            System.out.println("Первым появилас курица");
            return;
        }
        System.out.println("Первым появилось яйцо");
    }

}
