package com.dmdev.lesson15;

public class TrainGround {
    public static void main(String[] args) {
        Hero warrior = new Warrior("Yu", 10);

        Hero mage = new Mage("Гендальф", 7);

        Archer archer = new Archer("Леголас", 6);

        Enemy enemy = new Enemy("Зомби", 100);
        attackEnemy(enemy, warrior, mage, archer);
    }
    public static void attackEnemy(Enemy enemy, Hero... heroes){
        while (enemy.isAlive()){
            for (Hero hero : heroes){
                if (enemy.isAlive()) {
                    hero.attackEnemy(enemy);
                }
            }
        }
    }
}
