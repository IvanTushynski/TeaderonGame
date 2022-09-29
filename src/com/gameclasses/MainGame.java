package com.gameclasses;

import com.battles.FreavellBattles;
import com.monsters.Bosses;
import com.monsters.goblins;
import com.monsters.wolfs;

import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {
        Scanner gameScan = new Scanner(System.in);
        Warrior warOne = new Warrior();
        //монстры
        goblins goblinsFight = new goblins();
        wolfs wolfsFight = new wolfs();
        Bosses bossFight = new Bosses();

        FreavellBattles freavellBattles = new FreavellBattles();
        warOne.stateGenAttackWarrior(warOne.attackWarrior);
        warOne.stateGenDefenceWarrior(warOne.defenceWarrior);
        warOne.stateGenHpWarrior(warOne.hpWarrior);
        warOne.stateGenMpWarrior(warOne.mpWarrior);


        warOne.swordTruFalseOne = false;
        for (int gameCircle = 1; gameCircle > 0; gameCircle++) {
            System.out.println("Welcome To Teaderon World!\nThis World is Full of Mysteries And Adventures.");
            System.out.println("➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨");
            System.out.println("Enter Your Name Adventurer");
            warOne.name = gameScan.nextLine();
            //экспа - уровень - предметы
            warOne.levelsWarrior = 1;
            warOne.expAmountWar = 0;
            warOne.expPerLevelWar = 10;
            warOne.goldAmountWar = 0;

            //главное меню
            for (int m = 1; m > 0; m++) {
                //Повышение Уровня
                if (warOne.expAmountWar >= warOne.expPerLevelWar){
                    warOne.levelsWarrior = warOne.levelsWarrior + 1;
                    warOne.expPerLevelWar = warOne.levelsWarrior * 15;
                    warOne.expAmountWar = 0;
                    System.out.println("๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG!!!YOUR LEVEL UP!!!๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG");
                }
                System.out.println("▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦");
                System.out.println("▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦|❂ FREAVELL TOWN ❂|▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦");
                System.out.println("1 - ๖ۣۜG!HERO INFO!๖ۣۜG | 2 - ๖ۣۜG!MONSTER FOREST!๖ۣۜG | 3 - ๖ۣۜG!SHOP!๖ۣۜG");
                System.out.println("▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦");
                int menu = gameScan.nextInt();
                switch (menu) {
                    //Инфо по персонажу
                    case 1:
                        System.out.println("▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦");
                        System.out.println("➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨");
                        System.out.println("➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼|❂ HERO INFO ❂|➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼");
                        System.out.print(" |Attack " + warOne.stateGenAttackWarrior(warOne.attackWarrior));
                        System.out.print(" ▦Defence " + warOne.stateGenDefenceWarrior(warOne.defenceWarrior));
                        System.out.print(" ▦Hp " + warOne.stateGenHpWarrior(warOne.hpWarrior));
                        System.out.print(" ▦Mp " + warOne.stateGenMpWarrior(warOne.mpWarrior));
                        System.out.print(" ▦Level " + warOne.levelsWarrior);
                        System.out.print(" ▦Gold " + warOne.goldAmountWar);
                        System.out.println(" ▦Exp Amount/Needed To Up Level " + warOne.expAmountWar + "/" + warOne.expPerLevelWar + "|");
                        System.out.println("➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼➼");
                        System.out.println("➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨");
                        System.out.println("▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦");
                        System.out.println(" ");
                        break;
                    case 2:
                        System.out.println("๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG");
                        System.out.println("▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦! Welcome To Freavell Forest! Select Your Enemy To Fight !▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦▦");
                        System.out.print("▦1:➼ " + goblinsFight.nameGoblin1 + " [1LVL] ");
                        System.out.print("▦2:➼ " + goblinsFight.nameGoblin2 + " [4LVL] ");
                        System.out.print("▦3:➼ " + wolfsFight.nameWolf1 + " [8LVL] ");
                        System.out.print("▦4:➼ " + wolfsFight.nameWolf2 + " [12LVL] ");
                        System.out.print("▦5:➼ " + bossFight.nameBossOne + " [BOSS] ");
                        System.out.println("▦6:➼ " + "Back▦");
                        System.out.println("๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG");
                        System.out.println(" ");
                        int fight = gameScan.nextInt();
                        if (fight == 1) {
                            //что бы работало понижение жизней у перса и противника
                            warOne.YourRemainingLeaves = warOne.stateGenDefenceWarrior(warOne.defenceWarrior) + warOne.stateGenHpWarrior(warOne.hpWarrior);
                            warOne.EnemyRemainingLeaves = goblinsFight.hpGoblin1;
                            //сам цикл боя
                            for (int i = 1; i > 0; i++) {
                                System.out.println("Your Hero [" + warOne.name + "] Enemy [" + goblinsFight.nameGoblin1 + "]");
                                System.out.println("Select Enemy Attack-1\nSelect Leave From Battle-2");
                                int Attack = gameScan.nextInt();
                                if (Attack == 1) {
                                    if (warOne.YourRemainingLeaves > 0 && warOne.EnemyRemainingLeaves > 0) {
                                        warOne.fightWithGoblin1();
                                        //победа
                                    } else if (warOne.EnemyRemainingLeaves <= 0) {
                                        warOne.expAmountWar = warOne.expAmountWar + goblinsFight.expGoblin1;
                                        warOne.goldAmountWar = warOne.goldAmountWar + goblinsFight.goldGoblin1;
                                        System.out.println("๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG");
                                        System.out.println("➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨|❂ BATTLE INFO ❂|➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨");
                                        System.out.println("You Kill " + goblinsFight.nameGoblin1 + "And Obtained " + goblinsFight.expGoblin1 + "XP" + " And " + goblinsFight.goldGoblin1 + "Gold");
                                        System.out.println("๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG");
                                        System.out.println(" ");
                                        break;
                                        //поражение
                                    } else if (warOne.YourRemainingLeaves <= 0) {
                                        System.out.println("➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨");
                                        System.out.println("➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨|❂ BATTLE INFO ❂|➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨");
                                        System.out.println("You Lose... Killed By " + goblinsFight.nameGoblin1);
                                        System.out.println("๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG");
                                        System.out.println(" ");
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
                            //что бы работало понижение жизней у перса и противника
                            warOne.YourRemainingLeaves = warOne.stateGenDefenceWarrior(warOne.defenceWarrior) + warOne.stateGenHpWarrior(warOne.hpWarrior);
                            warOne.EnemyRemainingLeaves = goblinsFight.hpGoblin2;
                            //сам цикл боя
                            for (int i = 1; i > 0; i++) {
                                System.out.println("Your Hero [" + warOne.name + "] Enemy [" + goblinsFight.nameGoblin2 + "]");
                                System.out.println("Select Enemy Attack-1\n Select Leave From Battle-2");
                                int Attack = gameScan.nextInt();
                                if (Attack == 1) {
                                    if (warOne.YourRemainingLeaves > 0 && warOne.EnemyRemainingLeaves > 0) {
                                        warOne.fightWithGoblin2();
                                        //победа
                                    } else if (warOne.EnemyRemainingLeaves <= 0) {
                                        warOne.expAmountWar = warOne.expAmountWar + goblinsFight.expGoblin2;
                                        warOne.goldAmountWar = warOne.goldAmountWar + goblinsFight.goldGoblin2;
                                        System.out.println("๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG");
                                        System.out.println("➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨|❂ BATTLE INFO ❂|➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨");
                                        System.out.println("You Kill " + goblinsFight.nameGoblin2 + "And Obtained " + goblinsFight.expGoblin2 + "XP" + " And " + goblinsFight.goldGoblin2 + "Gold");
                                        System.out.println("๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG");
                                        System.out.println(" ");
                                        break;
                                        //поражение
                                    } else if (warOne.YourRemainingLeaves <= 0) {
                                        System.out.println("➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨");
                                        System.out.println("➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨|❂ BATTLE INFO ❂|➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨");
                                        System.out.println("You Lose... Killed By " + goblinsFight.nameGoblin2);
                                        System.out.println("๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG");
                                        System.out.println(" ");
                                        break;
                                    }
                                } else if (Attack == 2) {
                                    System.out.println("You Are Living In Combat...");
                                    break;
                                } else {
                                    System.out.println("Select Attack-1\n Select Leave-2");
                                }
                            }
                        } else if (fight == 3) {
                            //что бы работало понижение жизней у перса и противника
                            warOne.YourRemainingLeaves = warOne.stateGenDefenceWarrior(warOne.defenceWarrior) + warOne.stateGenHpWarrior(warOne.hpWarrior);
                            warOne.EnemyRemainingLeaves = wolfsFight.hpWolf1;
                            //сам цикл боя
                            for (int i = 1; i > 0; i++) {
                                System.out.println("Your Hero [" + warOne.name + "] Enemy [" + wolfsFight.nameWolf1 + "]");
                                System.out.println("Select Enemy Attack-1\nSelect Leave From Battle-2");
                                int Attack = gameScan.nextInt();
                                if (Attack == 1) {
                                    if (warOne.YourRemainingLeaves > 0 && warOne.EnemyRemainingLeaves > 0) {
                                        warOne.fightWithWolf1();
                                        //победа
                                    } else if (warOne.EnemyRemainingLeaves <= 0) {
                                        warOne.expAmountWar = warOne.expAmountWar + wolfsFight.expWolf1;
                                        warOne.goldAmountWar = warOne.goldAmountWar + wolfsFight.goldWolf1;
                                        System.out.println("๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG");
                                        System.out.println("➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨|❂ BATTLE INFO ❂|➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨");
                                        System.out.println("You Kill " + wolfsFight.nameWolf2 + "And Obtained " + wolfsFight.expWolf1 + "XP" + " And " + wolfsFight.goldWolf1 + "Gold");
                                        System.out.println("๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG");
                                        System.out.println(" ");
                                        break;
                                        //поражение
                                    } else if (warOne.YourRemainingLeaves <= 0) {
                                        System.out.println("๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG");
                                        System.out.println("➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨|❂ BATTLE INFO ❂|➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨");
                                        System.out.println("You Lose... Killed By " + wolfsFight.nameWolf1);
                                        System.out.println("๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG");
                                        System.out.println(" ");
                                        break;
                                    }
                                } else if (Attack == 2) {
                                    System.out.println("You Are Living In Combat...");
                                    break;
                                } else {
                                    System.out.println("Select Attack-1\n Select Leave-2");
                                }
                            }
                        } else if (fight == 4) {
                            //что бы работало понижение жизней у перса и противника
                            warOne.YourRemainingLeaves = warOne.stateGenDefenceWarrior(warOne.defenceWarrior) + warOne.stateGenHpWarrior(warOne.hpWarrior);
                            warOne.EnemyRemainingLeaves = wolfsFight.hpWolf2;
                            //сам цикл боя
                            for (int i = 1; i > 0; i++) {
                                System.out.println("Your Hero [" + warOne.name + "] Enemy [" + wolfsFight.nameWolf2 + "]");
                                System.out.println("Select Enemy Attack-1\nSelect Leave From Battle-2");
                                int Attack = gameScan.nextInt();
                                if (Attack == 1) {
                                    if (warOne.YourRemainingLeaves > 0 && warOne.EnemyRemainingLeaves > 0) {
                                        warOne.fightWithWolf2();
                                        //победа
                                    } else if (warOne.EnemyRemainingLeaves <= 0) {
                                        warOne.expAmountWar = warOne.expAmountWar + wolfsFight.expWolf2;
                                        warOne.goldAmountWar = warOne.goldAmountWar + wolfsFight.goldWolf2;
                                        System.out.println("๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG");
                                        System.out.println("➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨|❂ BATTLE INFO ❂|➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨");
                                        System.out.println("You Kill " + wolfsFight.nameWolf2 + "And Obtained " + wolfsFight.expWolf2 + "XP" + " And " + wolfsFight.goldWolf2 + "Gold");
                                        System.out.println("๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG");
                                        System.out.println(" ");
                                        break;
                                        //поражение
                                    } else if (warOne.YourRemainingLeaves <= 0) {
                                        System.out.println("๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG");
                                        System.out.println("➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨|❂ BATTLE INFO ❂|➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨");
                                        System.out.println("You Lose... Killed By " + wolfsFight.nameWolf2);
                                        System.out.println("๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG");
                                        System.out.println(" ");
                                        break;
                                    }
                                } else if (Attack == 2) {
                                    System.out.println("You Are Living In Combat...");
                                    break;
                                } else {
                                    System.out.println("Select Attack-1\n Select Leave-2");
                                }
                            }
                        } else if (fight == 5) {
                            //что бы работало понижение жизней у перса и противника
                            warOne.YourRemainingLeaves = warOne.stateGenDefenceWarrior(warOne.defenceWarrior) + warOne.stateGenHpWarrior(warOne.hpWarrior);
                            warOne.EnemyRemainingLeaves = bossFight.hpBossOne;
                            //сам цикл боя
                            for (int i = 1; i > 0; i++) {
                                System.out.println("Your Hero [" + warOne.name + "] Enemy [" + bossFight.nameBossOne + "]");
                                System.out.println("Select Enemy Attack-1\nSelect Leave From Battle-2");
                                int Attack = gameScan.nextInt();
                                if (Attack == 1) {
                                    if (warOne.YourRemainingLeaves > 0 && warOne.EnemyRemainingLeaves > 0) {
                                        warOne.fightWithBoss1();
                                        //победа
                                    } else if (warOne.EnemyRemainingLeaves <= 0) {
                                        warOne.expAmountWar = warOne.expAmountWar + bossFight.expBossOne;
                                        warOne.goldAmountWar = warOne.goldAmountWar + bossFight.goldBossOne;
                                        System.out.println("๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG");
                                        System.out.println("➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨|❂ BATTLE INFO ❂|➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨");
                                        System.out.println("You Kill " + bossFight.nameBossOne + "And Obtained " + bossFight.expBossOne + "XP" + " And " + bossFight.goldBossOne + "Gold");
                                        System.out.println("๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG");
                                        System.out.println(" ");
                                        break;
                                        //поражение
                                    } else if (warOne.YourRemainingLeaves <= 0) {
                                        System.out.println("๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG");
                                        System.out.println("➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨|❂ BATTLE INFO ❂|➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨➨");
                                        System.out.println("You Lose... Killed By " + bossFight.nameBossOne);
                                        System.out.println("๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG๖ۣۜG");
                                        System.out.println(" ");
                                        break;
                                    }
                                } else if (Attack == 2) {
                                    System.out.println("You Are Living In Combat...");
                                    break;
                                } else {
                                    System.out.println("Select Attack-1\n Select Leave-2");
                                }
                            }
                        } else if (fight == 6) {
                            System.out.println("You Are Living In Monster Forest...");
                        }
                        break;
                    case 3:

                        }
                }
            }
        }
    }


