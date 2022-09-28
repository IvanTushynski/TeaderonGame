package com.gameclasses;

import com.monsters.goblins;

import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {
        Scanner gameScan = new Scanner(System.in);
        Warrior warOne = new Warrior();
        goblins goblinsFight = new goblins();
        warOne.stateGenAttackWarrior(warOne.attackWarrior);
        warOne.stateGenDefenceWarrior(warOne.defenceWarrior);
        warOne.stateGenHpWarrior(warOne.hpWarrior);
        warOne.stateGenMpWarrior(warOne.mpWarrior);

        warOne.swordTruFalseOne = false;
        for (int gameCircle = 1; gameCircle > 0; gameCircle++) {

            System.out.print("|Level " + warOne.levelsWarrior);
            System.out.println("|Exp Amount/Needed To Up Level " + warOne.expAmountWar + "/" + warOne.expPerLevelWar);

            //главное меню
            for (int m = 1; m > 0; m++) {
                //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                warOne.levelsWarrior = 1;
                warOne.expAmountWar = 0;
                warOne.expPerLevelWar = warOne.levelsWarrior * 10;
                if (warOne.expAmountWar >= warOne.expPerLevelWar){
                    warOne.levelsWarrior = warOne.levelsWarrior + 1;
                    System.out.println("Level Up!!!");
                }
                System.out.println("1 - Hero Info | 2 - Monsters");
                int menu = gameScan.nextInt();
                switch (menu) {
                    case 1:
                        System.out.println("---------------------------| Hero Info |------------------------------");
                        System.out.print("|Attack " + warOne.stateGenAttackWarrior(warOne.attackWarrior));
                        System.out.print("|Defence " + warOne.stateGenDefenceWarrior(warOne.defenceWarrior));
                        System.out.print("|Hp " + warOne.stateGenHpWarrior(warOne.hpWarrior));
                        System.out.print("|Mp " + warOne.stateGenMpWarrior(warOne.mpWarrior));
                        System.out.print("|Level " + warOne.levelsWarrior);
                        System.out.println("|Exp Amount/Needed To Up Level " + warOne.expAmountWar + "/" + warOne.expPerLevelWar);
                        System.out.println("----------------------------------------------------------------------");
                        break;
                    case 2:
                        //бой с гоблином 1-----------------------------------------------------
                        System.out.println("Select Fight-1 Or Leave-2");
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
                                    if (warOne.YourRemainingLeaves > 0 && warOne.EnemyRemainingLeaves > 0) {
                                        warOne.fightWithGoblin1();
                                        //победа
                                    } else if (warOne.EnemyRemainingLeaves <= 0) {
                                        warOne.expAmountWar = warOne.expAmountWar + goblinsFight.expGoblin1;
                                        System.out.println("You Kill " + goblinsFight.nameGoblin1 + "And Obtained " + goblinsFight.expGoblin1 + "XP");
                                        break;
                                        //поражение
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
                    //case 3:
                        }
                }
            }
        }
    }


