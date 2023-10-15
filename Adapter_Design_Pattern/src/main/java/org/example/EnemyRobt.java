package org.example;

import java.util.Random;

public class EnemyRobt {

    Random generator =new Random();
    public void smashWithHands(){
        int attackDamage = generator.nextInt(10)+1;
        System.out.println("Enemy Robot Causes "+attackDamage+"Damage with its hand");

    }

    public void walkForward(){
        int movement =generator.nextInt(10)+1;
        System.out.println("Enemy Robot walks Forward "+movement+" spaces");
    }

    public void reactTohuman(String driverName){
        System.out.println("Enemy Robot Tramps on "+ driverName);
    }
}
