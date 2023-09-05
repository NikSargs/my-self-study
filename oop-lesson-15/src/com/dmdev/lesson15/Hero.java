package com.dmdev.lesson15;

public abstract class Hero<T> {
    private String name;

    private int damage;
    private T weapon;
    public Hero(String name,int damage) {
        this.name = name;
        this.damage = damage;
    }
    public void attackEnemy(Enemy enemy){
        System.out.println(name + " атакует врага" + enemy.getName());
    }

    public String getName() {
        return name;
    }
    public int getDamage() {
        return damage;
    }

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }
}
