package com.gameclasses;

import java.util.Scanner;
import com.gameclasses.Warrior;
import com.weapons.swords;

public class MainGame {
    public static void main(String[] args) {

        Warrior.stateGen();
        Warrior.swordOneGen();

        Scanner gameScan = new Scanner(System.in);
        Warrior.levelsWarrior = gameScan.nextInt();
        Warrior.swordOneGen();
        System.out.println(Experience.expPerLevelWar + " Experience Needed");
        System.out.println(Warrior.levelsWarrior + " Level");
        System.out.println(Warrior.attackWarrior + " Attack");
    }
}
