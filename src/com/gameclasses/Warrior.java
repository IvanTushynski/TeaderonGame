package com.gameclasses;

import com.weapons.swords;

public class Warrior {

    String name = "Warrior";
    public static int hpWarrior = 20;
    public static int mpWarrior = 10;
    public static int attackWarrior = 10;
    public static int defenceWarrior = 20;
    public static int levelsWarrior;

    public Warrior(String name, int hpWarrior, int mpWarrior, int attackWarrior, int defenceWarrior, int levelsWarrior) {
        this.name = name;
        this.hpWarrior = hpWarrior;
        this.mpWarrior = mpWarrior;
        this.attackWarrior = attackWarrior;
        this.defenceWarrior = defenceWarrior;
        this.levelsWarrior = levelsWarrior;
    }

    public static void stateGen() {
        if (levelsWarrior > 0 && levelsWarrior <= 20) {
            attackWarrior = attackWarrior + levelsWarrior;
            defenceWarrior = defenceWarrior + levelsWarrior;
            hpWarrior = hpWarrior + levelsWarrior * 2;
        }
    }
    public static void swordOneGen() {

        boolean swordTruFalseOne;

        if (swordTruFalseOne = true) {
            attackWarrior = attackWarrior + levelsWarrior + swords.swordOneDamage;
            defenceWarrior = defenceWarrior + levelsWarrior + swords.swordOneDefence;
            hpWarrior = hpWarrior + levelsWarrior * 2 + swords.swordOneHP;
        } else {
            attackWarrior = attackWarrior + levelsWarrior;
            defenceWarrior = defenceWarrior + levelsWarrior;
            hpWarrior = hpWarrior + levelsWarrior * 2;
        }


    }
}
