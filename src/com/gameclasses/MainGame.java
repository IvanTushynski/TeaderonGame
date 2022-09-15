package com.gameclasses;

import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {

        Scanner scanLvl = new Scanner(System.in);
        Scanner scanClass = new Scanner(System.in);

        Warrior gameWarrior = new Warrior();
        Mage gameMage = new Mage();

        System.out.println("Select Player Class - Mage(1) or Warrior(2)");
        int nameClass = scanClass.nextInt();

        if (nameClass == 1){
            System.out.println("You Selected Class [Mage]");
        } else if (nameClass == 2) {
            System.out.println("You Selected Class [Warrior]");
        } else {
            System.out.println("No Such Class...");
        }

        System.out.println("Enter Player Level");
        int playerLevel = scanLvl.nextInt();
        int expPerLevel = 100;

        for (int iWarrior = 1; iWarrior <= playerLevel; iWarrior++){
            if (playerLevel <= 20 && nameClass == 2) {
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
            } else if (playerLevel <= 20 && nameClass == 1) {
                gameMage.hpMage = gameMage.hpMage + 10;
                gameMage.mpMage = gameMage.mpMage + 10;
                gameMage.attackMage = gameMage.attackMage + 10;
                gameMage.defenceMage = gameMage.defenceMage + 5;

                expPerLevel = expPerLevel + 100;

                System.out.println(gameMage.name);
                System.out.println("Player Level:" + iWarrior);
                System.out.println("HP-" + gameMage.hpMage);
                System.out.println("MP-" + gameMage.mpMage);
                System.out.println("Attack-" + gameMage.attackMage);
                System.out.println("Defence-" + gameMage.defenceMage);
                System.out.println("Experience Per Level:" + expPerLevel);
                System.out.println("------------------");
            }else {
                System.out.println("Undefined Level of Class...");
                break;
            }
        }

    }
}
