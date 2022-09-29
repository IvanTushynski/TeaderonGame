package com.battles;

import com.gameclasses.MainGame;
import com.gameclasses.Warrior;
import com.monsters.goblins;
import com.weapons.Swords;

import java.util.Scanner;

public class FreavellBattles extends MainGame {
    Warrior warOne = new Warrior();
    goblins goblinsFight = new goblins();

    MainGame mainGame = new MainGame();

    public void FreavellBattleGoblin1() {
        Scanner gameScan = new Scanner(System.in);
        System.out.println("1:" + goblinsFight.nameGoblin1 +  " 2:Leave");
        int fight = gameScan.nextInt();
        if (fight == 1) {
            //что бы работало понижение жизней у перса и противника
            warOne.YourRemainingLeaves = warOne.stateGenDefenceWarrior(warOne.defenceWarrior) + warOne.stateGenHpWarrior(warOne.hpWarrior);
            warOne.EnemyRemainingLeaves = goblinsFight.hpGoblin1;
            //сам цикл боя
            for (int i = 1; i > 0; i++) {
                System.out.println("Your Hero |" + warOne.name + "| Enemy |" + goblinsFight.nameGoblin1);
                System.out.println("Select Enemy Attack-1\n Select Leave From Battle-2");
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
            System.out.println("You Are Living In Monster Forest...");
        }
    }

}
