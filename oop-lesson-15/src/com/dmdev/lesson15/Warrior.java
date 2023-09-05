package com.dmdev.lesson15;

public class Warrior<T> extends Hero<T>{
    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName()+ " ударил мечом " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
