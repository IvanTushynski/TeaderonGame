package com.gameclasses;

import com.monsters.goblins;

import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {

        Warrior warOne = new Warrior();
        goblins goblinsFight = new goblins();
        warOne.stateGenAttackWarrior(warOne.attackWarrior);
        warOne.stateGenDefenceWarrior(warOne.defenceWarrior);
        warOne.stateGenHpWarrior(warOne.hpWarrior);
        warOne.stateGenMpWarrior(warOne.mpWarrior);

        warOne.swordTruFalseOne = false;


        System.out.println("Your Attack " + warOne.stateGenAttackWarrior(warOne.attackWarrior));


        //бой с гоблином 1-----------------------------------------------------
        System.out.println("Select Fight-1 Or Leave-2");
        Scanner gameScan = new Scanner(System.in);
        int fight = gameScan.nextInt();
        if (fight == 1) {
            //что бы работало понижение жизней у перса и противника
            warOne.YourRemainingLeaves = warOne.stateGenDefenceWarrior(warOne.defenceWarrior) + warOne.stateGenHpWarrior(warOne.hpWarrior);
            warOne.EnemyRemainingLeaves = goblinsFight.hpGoblin1;
            //сам цикл боя
            for (int i = 1; i > 0; i++) {
                System.out.println("Your Hero |" + warOne.name + "| Enemy |" + goblinsFight.nameGoblin1);
                System.out.println("Select Attack-1\n Select Leave-2");
                int Attack = gameScan.nextInt();
                if (Attack == 1) {
                    if (warOne.YourRemainingLeaves > 0 || warOne.EnemyRemainingLeaves > 0) {
                        warOne.fightWithGoblin1();
                    } else if (warOne.EnemyRemainingLeaves <= 0) {
                        System.out.println("You Win Killing " + goblinsFight.nameGoblin1);
                        break;
                    } else if (warOne.YourRemainingLeaves <= 0) {
                        System.out.println("You Lose... Killed By " + goblinsFight.nameGoblin1);
                        break;
                    }
                } else if (Attack == 2) {
                    System.out.println("You Are Living In Combat...");
                    break;
                } else {
                    System.out.println("Select Attack-1\n Select Leave-2");
                }
            }
        } else if (fight == 2) {
            System.out.println("You Are Living In Combat...");
        }
    }
}


