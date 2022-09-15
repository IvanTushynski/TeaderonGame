package com.gameclasses;

import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {

        Scanner scanLvl = new Scanner(System.in);
        Scanner scanClass = new Scanner(System.in);

        Warrior gameWarrior = new Warrior();
        Mage gameMage = new Mage();

        //не работает
        System.out.println("Enter Player Class - Mage or Warrior");
        String nameClass = scanClass.nextLine();

        if (nameClass == "Warrior"){
            System.out.println("Your Selected Class: Warrior");
        } else if (nameClass == "Mage") {
            System.out.println("Your Selected Class: Mage");
        } else {
            System.out.println("No Such Class...");
        }

        System.out.println("Enter Player Level");
        int playerLevel = scanLvl.nextInt();
        int expPerLevel = 100;

        for (int iWarrior = 1; iWarrior <= playerLevel; iWarrior++){
            if (playerLevel <= 20) {
                gameWarrior.hpWarrior = gameWarrior.hpWarrior + 10;
                gameWarrior.mpWarrior = gameWarrior.mpWarrior + 10;
                gameWarrior.attackWarrior = gameWarrior.attackWarrior + 10;
                gameWarrior.defenceWarrior = gameWarrior.defenceWarrior + 10;

                expPerLevel = expPerLevel + 100;

                System.out.println(gameWarrior.name);
                System.out.println("Player Level:" + iWarrior);
                System.out.println("HP-" + gameWarrior.hpWarrior);
                System.out.println("MP-" + gameWarrior.mpWarrior);
                System.out.println("Attack-" + gameWarrior.attackWarrior);
                System.out.println("Defence-" + gameWarrior.defenceWarrior);
                System.out.println("Experience Per Level:" + expPerLevel);
                System.out.println("------------------");
            }else {
                System.out.println("Max Level 20");
                break;
            }
        }

    }
}
