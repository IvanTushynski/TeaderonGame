package com.gameclasses;

import com.monsters.goblins;
import com.weapons.Swords;

import java.util.Scanner;

class Warrior {

    String name = "Warrior";
    int hpWarrior = 20;
    int mpWarrior = 10;
    int attackWarrior = 8;
    int defenceWarrior = 20;
    int levelsWarrior;
    boolean swordTruFalseOne;

    int expPerLevelWar = 10 * levelsWarrior;


    int attackFight;
    int defFight;


    public int stateGenAttackWarrior(int attackWarrior) {
        if (levelsWarrior > 0 && levelsWarrior <= 20 && !swordTruFalseOne) {
            attackWarrior = attackWarrior + levelsWarrior;
        }else if (levelsWarrior > 0 && levelsWarrior <= 20 && swordTruFalseOne){
            attackWarrior = attackWarrior + levelsWarrior + Swords.swordOneDamage;
        }
        return attackWarrior;

    }
    public int stateGenDefenceWarrior(int defenceWarrior) {
        if (levelsWarrior > 0 && levelsWarrior <= 20 && !swordTruFalseOne) {
            defenceWarrior = defenceWarrior + levelsWarrior;
        }else if (levelsWarrior > 0 && levelsWarrior <= 20 && swordTruFalseOne){
            defenceWarrior = defenceWarrior + levelsWarrior + Swords.swordOneDefence;
        }
        return defenceWarrior;
    }

    public int stateGenHpWarrior(int hpWarrior) {
        if (levelsWarrior > 0 && levelsWarrior <= 20 && !swordTruFalseOne) {
            hpWarrior = hpWarrior + levelsWarrior * 2;
        }else if (levelsWarrior > 0 && levelsWarrior <= 20 && swordTruFalseOne){
            hpWarrior = hpWarrior + levelsWarrior * 2 + Swords.swordOneHP;
        }
        return hpWarrior;
    }

    public int stateGenMpWarrior(int mpWarrior) {
        if (levelsWarrior > 0 && levelsWarrior <= 20 && !swordTruFalseOne) {
            mpWarrior = (mpWarrior + levelsWarrior) + 2;
        }else if (levelsWarrior > 0 && levelsWarrior <= 20 && swordTruFalseOne){
            mpWarrior = (mpWarrior + levelsWarrior) + 2;
        }
        return mpWarrior;
    }

    public void fightWithGoblin1() {
        goblins gobl1 = new goblins();
        for (int i = 0; i < 1; i++ ){
            attackFight = gobl1.hpGoblin1 - stateGenAttackWarrior(attackWarrior);
            defFight = (stateGenDefenceWarrior(defenceWarrior) + stateGenHpWarrior(hpWarrior)) - gobl1.attackGoblin1;
            System.out.println("You Deal " + "[" + stateGenAttackWarrior(attackWarrior) + "]" + "Damage " + "|Enemy Hp Remaining" + attackFight);
            System.out.println("Enemy Deal " + "[" + gobl1.attackGoblin1 + "]" + " Damage " + "|Your Hp Remaining" + defFight);
        }
    }
}
