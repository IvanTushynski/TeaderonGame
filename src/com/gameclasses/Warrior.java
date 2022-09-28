package com.gameclasses;

import com.weapons.Swords;

class Warrior {

    String name = "Warrior";
    int hpWarrior = 20;
    int mpWarrior = 10;
    int attackWarrior = 10;
    int defenceWarrior = 20;
    int levelsWarrior;
    boolean swordTruFalseOne;

    int expPerLevelWar = 10 * levelsWarrior;


    public void stateGen() {
        if (levelsWarrior > 0 && levelsWarrior <= 20 && !swordTruFalseOne) {
            attackWarrior = attackWarrior + levelsWarrior;
            defenceWarrior = defenceWarrior + levelsWarrior;
            hpWarrior = hpWarrior + levelsWarrior * 2;
            mpWarrior = (mpWarrior + levelsWarrior) + 2;
        }else if (levelsWarrior > 0 && levelsWarrior <= 20 && swordTruFalseOne){
            attackWarrior = attackWarrior + levelsWarrior + Swords.swordOneDamage;
            defenceWarrior = defenceWarrior + levelsWarrior + Swords.swordOneDefence;
            hpWarrior = hpWarrior + levelsWarrior * 2 + Swords.swordOneHP;
            mpWarrior = (mpWarrior + levelsWarrior) + 2;
        }
    }

    }
