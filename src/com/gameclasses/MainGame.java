package com.gameclasses;

import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {

        Warrior warOne = new Warrior();
        warOne.stateGen();
        warOne.swordTruFalseOne = true;

        Scanner gameScan = new Scanner(System.in);
        warOne.levelsWarrior = gameScan.nextInt();
        System.out.println(warOne.levelsWarrior + " Level");
        System.out.println(warOne.attackWarrior + " Attack");
    }
}
