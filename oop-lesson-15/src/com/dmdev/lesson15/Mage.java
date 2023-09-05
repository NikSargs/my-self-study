package com.dmdev.lesson15;

public class Mage<T> extends Hero<T>{

    public Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " сотвроил заклинание на " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
