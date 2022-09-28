package com.gameclasses;

import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {

        Warrior warOne = new Warrior();
        warOne.stateGenAttackWarrior(warOne.attackWarrior);
        warOne.stateGenDefenceWarrior(warOne.defenceWarrior);
        warOne.stateGenHpWarrior(warOne.hpWarrior);
        warOne.stateGenMpWarrior(warOne.mpWarrior);

        warOne.swordTruFalseOne = false;


        //System.out.println("Your Attack " + warOne.stateGenAttackWarrior(warOne.attackWarrior));
        System.out.println( "Select Attack-1 Or Leave-2");
        Scanner gameScan = new Scanner(System.in);
        int fight = gameScan.nextInt();
        if (fight == 1){
            for (int i = 0; i < 1; i++){
                warOne.fightWithGoblin1();
            }
        } else if (fight == 2){
            System.out.println("You Are Living In Combat...");
        }
        //warOne.name = gameScan.nextLine();
        //warOne.levelsWarrior = gameScan.nextInt();
        //System.out.println(warOne.name + " Name");
        //System.out.println(warOne.stateGenAttackWarrior(warOne.attackWarrior) + " Attack");
        //System.out.println(warOne.stateGenDefenceWarrior(warOne.defenceWarrior) + " Defence");
        //System.out.println(warOne.stateGenHpWarrior(warOne.hpWarrior) + " Hp");
        //System.out.println(warOne.stateGenMpWarrior(warOne.mpWarrior) + " Mp");
        //System.out.println(warOne.expPerLevelWar + " Exp");

    }
}
