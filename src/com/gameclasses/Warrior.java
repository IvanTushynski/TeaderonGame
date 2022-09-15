package com.gameclasses;

public class Warrior {

    String name = "Warrior";
    int hpWarrior = 20;
    int mpWarrior = 10;
    int attackWarrior = 10;
    int defenceWarrior = 20;

    public Warrior() {
        this.name = name;
        this.hpWarrior = hpWarrior;
        this.mpWarrior = mpWarrior;
        this.attackWarrior = attackWarrior;
        this.defenceWarrior = defenceWarrior;
    }
        @Override
        public String toString() {
            return "Warrior{" +
                    "name='" + name + '\'' +
                    ", hpWarrior=" + hpWarrior +
                    ", mpWarrior=" + mpWarrior +
                    ", attackWarrior=" + attackWarrior +
                    ", defenceWarrior=" + defenceWarrior +
                    '}';
        }
}
