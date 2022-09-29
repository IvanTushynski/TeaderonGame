package com.gameclasses;

import com.battles.FreavellBattles;
import com.monsters.goblins;

import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {
        Scanner gameScan = new Scanner(System.in);
        Warrior warOne = new Warrior();
        goblins goblinsFight = new goblins();
        FreavellBattles freavellBattles = new FreavellBattles();
        warOne.stateGenAttackWarrior(warOne.attackWarrior);
        warOne.stateGenDefenceWarrior(warOne.defenceWarrior);
        warOne.stateGenHpWarrior(warOne.hpWarrior);
        warOne.stateGenMpWarrior(warOne.mpWarrior);


        warOne.swordTruFalseOne = false;
        for (int gameCircle = 1; gameCircle > 0; gameCircle++) {
            //экспа и уровень
            warOne.levelsWarrior = 1;
            warOne.expAmountWar = 0;
            warOne.expPerLevelWar = 10;

            //главное меню
            for (int m = 1; m > 0; m++) {
                //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                if (warOne.expAmountWar >= warOne.expPerLevelWar){
                    warOne.levelsWarrior = warOne.levelsWarrior + 1;
                    warOne.expPerLevelWar = warOne.levelsWarrior * 15;
                    System.out.println("--------------------------!!!Your Level Up!!!--------------------------");
                }
                System.out.println("--------------|Fleavell Town|--------------");
                System.out.println("1 - Hero Info | 2 - Monster Forest | 3 - Shop");
                int menu = gameScan.nextInt();
                switch (menu) {
                    //Инфо по персонажу
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
                        freavellBattles.FreavellBattleGoblin1();
                        break;
                    case 3:

                        }
                }
            }
        }
    }


