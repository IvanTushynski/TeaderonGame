package com.battles;

import com.gameclasses.MainGame;
import com.gameclasses.Warrior;
import com.monsters.Bosses;
import com.monsters.goblins;
import com.monsters.wolfs;
import com.weapons.Swords;

import java.util.Scanner;

public class FreavellBattles extends MainGame {
    Warrior warOne = new Warrior();
    goblins goblinsFight = new goblins();
    wolfs wolfsFight = new wolfs();

    Bosses bossFight = new Bosses();

    MainGame mainGame = new MainGame();

    public void FreavellBattleGoblin1() {
        Scanner gameScan = new Scanner(System.in);
        //копировать отсюда
        System.out.println("Welcome To Freavell Forest! Select Your Enemy To Fight.");
        System.out.println("1: " + goblinsFight.nameGoblin1 + " [1lvl]");
        System.out.println("2: " + goblinsFight.nameGoblin2 + " [4lvl]");
        System.out.println("3: " + wolfsFight.nameWolf1 + " [8lvl]");
        System.out.println("4: " + wolfsFight.nameWolf2 + " [12lvl]");
        System.out.println("5: " + bossFight.nameBossOne + " [Boss]");
        System.out.println("6: " + "Back...");
        int fight = gameScan.nextInt();
        if (fight == 1) {
            //что бы работало понижение жизней у перса и противника
            warOne.YourRemainingLeaves = warOne.stateGenDefenceWarrior(warOne.defenceWarrior) + warOne.stateGenHpWarrior(warOne.hpWarrior);
            warOne.EnemyRemainingLeaves = goblinsFight.hpGoblin1;
            //сам цикл боя
            for (int i = 1; i > 0; i++) {
                System.out.println("Your Hero [" + warOne.name + "] Enemy [" + goblinsFight.nameGoblin1);
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
            //что бы работало понижение жизней у перса и противника
            warOne.YourRemainingLeaves = warOne.stateGenDefenceWarrior(warOne.defenceWarrior) + warOne.stateGenHpWarrior(warOne.hpWarrior);
            warOne.EnemyRemainingLeaves = goblinsFight.hpGoblin2;
            //сам цикл боя
            for (int i = 1; i > 0; i++) {
                System.out.println("Your Hero [" + warOne.name + "] Enemy [" + goblinsFight.nameGoblin2);
                System.out.println("Select Enemy Attack-1\n Select Leave From Battle-2");
                int Attack = gameScan.nextInt();
                if (Attack == 1) {
                    if (warOne.YourRemainingLeaves > 0 && warOne.EnemyRemainingLeaves > 0) {
                        warOne.fightWithGoblin2();
                        //победа
                    } else if (warOne.EnemyRemainingLeaves <= 0) {
                        warOne.expAmountWar = warOne.expAmountWar + goblinsFight.expGoblin2;
                        System.out.println("You Kill " + goblinsFight.nameGoblin2 + "And Obtained " + goblinsFight.expGoblin2 + "XP");
                        break;
                        //поражение
                    } else if (warOne.YourRemainingLeaves <= 0) {
                        System.out.println("You Lose... Killed By " + goblinsFight.nameGoblin2);
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
                System.out.println("Your Hero [" + warOne.name + "] Enemy [" + wolfsFight.nameWolf1);
                System.out.println("Select Enemy Attack-1\n Select Leave From Battle-2");
                int Attack = gameScan.nextInt();
                if (Attack == 1) {
                    if (warOne.YourRemainingLeaves > 0 && warOne.EnemyRemainingLeaves > 0) {
                        warOne.fightWithWolf1();
                        //победа
                    } else if (warOne.EnemyRemainingLeaves <= 0) {
                        warOne.expAmountWar = warOne.expAmountWar + wolfsFight.expWolf1;
                        System.out.println("You Kill " + wolfsFight.nameWolf2 + "And Obtained " + wolfsFight.expWolf1 + "XP");
                        break;
                        //поражение
                    } else if (warOne.YourRemainingLeaves <= 0) {
                        System.out.println("You Lose... Killed By " + wolfsFight.nameWolf1);
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
                System.out.println("Your Hero [" + warOne.name + "] Enemy [" + wolfsFight.nameWolf2);
                System.out.println("Select Enemy Attack-1\n Select Leave From Battle-2");
                int Attack = gameScan.nextInt();
                if (Attack == 1) {
                    if (warOne.YourRemainingLeaves > 0 && warOne.EnemyRemainingLeaves > 0) {
                        warOne.fightWithWolf2();
                        //победа
                    } else if (warOne.EnemyRemainingLeaves <= 0) {
                        warOne.expAmountWar = warOne.expAmountWar + wolfsFight.expWolf2;
                        System.out.println("You Kill " + wolfsFight.nameWolf2 + "And Obtained " + wolfsFight.expWolf1 + "XP");
                        break;
                        //поражение
                    } else if (warOne.YourRemainingLeaves <= 0) {
                        System.out.println("You Lose... Killed By " + wolfsFight.nameWolf2);
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
                System.out.println("Your Hero [" + warOne.name + "] Enemy [" + bossFight.nameBossOne);
                System.out.println("Select Enemy Attack-1\n Select Leave From Battle-2");
                int Attack = gameScan.nextInt();
                if (Attack == 1) {
                    if (warOne.YourRemainingLeaves > 0 && warOne.EnemyRemainingLeaves > 0) {
                        warOne.fightWithBoss1();
                        //победа
                    } else if (warOne.EnemyRemainingLeaves <= 0) {
                        warOne.expAmountWar = warOne.expAmountWar + bossFight.expBossOne;
                        System.out.println("You Kill " + bossFight.nameBossOne + "And Obtained " + bossFight.expBossOne + "XP");
                        break;
                        //поражение
                    } else if (warOne.YourRemainingLeaves <= 0) {
                        System.out.println("You Lose... Killed By " + bossFight.nameBossOne);
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
    }

}
