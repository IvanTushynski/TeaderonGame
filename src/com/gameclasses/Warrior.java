package com.gameclasses;

import com.monsters.Bosses;
import com.monsters.goblins;
import com.monsters.wolfs;
import com.weapons.Swords;

public class Warrior {
    //Монстры
    goblins gobl1 = new goblins();
    wolfs wolf1 = new wolfs();
    Bosses boss1 = new Bosses();

    //Статы Перса
    public String name = "Warrior";
    public int hpWarrior = 20;
    int mpWarrior = 10;
    int attackWarrior = 8;
    public int defenceWarrior = 20;

    //Уровень и Опыт
    int levelsWarrior;
    int expPerLevelWar;
    public int expAmountWar;
    public int goldAmountWar;

    //Оружие
    boolean swordTruFalseOne;



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
    public int YourRemainingLeaves;
    public int EnemyRemainingLeaves;

    public void fightWithGoblin1() {
        for (int i = 0; i < 1; i++ ){
            EnemyRemainingLeaves = EnemyRemainingLeaves - stateGenAttackWarrior(attackWarrior);
            YourRemainingLeaves = YourRemainingLeaves - gobl1.attackGoblin1;
            System.out.println("You Deal " + "[" + stateGenAttackWarrior(attackWarrior) + "] " + "Damage " + "| Enemy Hp Remaining: " + EnemyRemainingLeaves);
            System.out.println("Enemy Deal " + "[" + gobl1.attackGoblin1 + "] " + " Damage " + "| Your Hp Remaining: " + YourRemainingLeaves);
        }
    }

    public void fightWithGoblin2() {
        for (int i = 0; i < 1; i++ ){
            EnemyRemainingLeaves = EnemyRemainingLeaves - stateGenAttackWarrior(attackWarrior);
            YourRemainingLeaves = YourRemainingLeaves - gobl1.attackGoblin2;
            System.out.println("You Deal " + "[" + stateGenAttackWarrior(attackWarrior) + "] " + "Damage " + "| Enemy Hp Remaining: " + EnemyRemainingLeaves);
            System.out.println("Enemy Deal " + "[" + gobl1.attackGoblin2 + "] " + " Damage " + "| Your Hp Remaining: " + YourRemainingLeaves);
        }
    }

    public void fightWithWolf1() {
        for (int i = 0; i < 1; i++ ){
            EnemyRemainingLeaves = EnemyRemainingLeaves - stateGenAttackWarrior(attackWarrior);
            YourRemainingLeaves = YourRemainingLeaves - wolf1.attackWolf1;
            System.out.println("You Deal " + "[" + stateGenAttackWarrior(attackWarrior) + "] " + "Damage " + "| Enemy Hp Remaining: " + EnemyRemainingLeaves);
            System.out.println("Enemy Deal " + "[" + wolf1.attackWolf1 + "] " + " Damage " + "| Your Hp Remaining: " + YourRemainingLeaves);
        }
    }

    public void fightWithWolf2() {
        for (int i = 0; i < 1; i++ ){
            EnemyRemainingLeaves = EnemyRemainingLeaves - stateGenAttackWarrior(attackWarrior);
            YourRemainingLeaves = YourRemainingLeaves - wolf1.attackWolf2;
            System.out.println("You Deal " + "[" + stateGenAttackWarrior(attackWarrior) + "] " + "Damage " + "| Enemy Hp Remaining: " + EnemyRemainingLeaves);
            System.out.println("Enemy Deal " + "[" + wolf1.attackWolf2 + "] " + " Damage " + "| Your Hp Remaining: " + YourRemainingLeaves);
        }
    }

    public void fightWithBoss1() {
        for (int i = 0; i < 1; i++ ){
            EnemyRemainingLeaves = EnemyRemainingLeaves - stateGenAttackWarrior(attackWarrior);
            YourRemainingLeaves = YourRemainingLeaves - boss1.attackBossOne;
            System.out.println("You Deal " + "[" + stateGenAttackWarrior(attackWarrior) + "] " + "Damage " + "| Enemy Hp Remaining: " + EnemyRemainingLeaves);
            System.out.println("Enemy Deal " + "[" + boss1.attackBossOne + "] " + " Damage " + "| Your Hp Remaining: " + YourRemainingLeaves);
        }
    }
}
