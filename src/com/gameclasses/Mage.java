package com.gameclasses;

public class Mage {

    String name = "Mage";
    int hpMage = 10;
    int mpMage = 20;
    int attackMage = 20;
    int defenceMage = 5;

    public Mage() {
        this.name = name;
        this.hpMage = hpMage;
        this.mpMage = mpMage;
        this.attackMage = attackMage;
        this.defenceMage = defenceMage;
    }

    @Override
    public String toString() {
        return "Mage{" +
                "name='" + name + '\'' +
                ", hpMage=" + hpMage +
                ", mpMage=" + mpMage +
                ", attackMage=" + attackMage +
                ", defenceMage=" + defenceMage +
                '}';
    }
}
