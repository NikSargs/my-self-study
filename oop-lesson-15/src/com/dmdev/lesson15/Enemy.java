package com.dmdev.lesson15;

public class Enemy implements Mortal{
    private String name;
    private int health;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void takeDamage(int damage){
        if(isAlive() && health <= damage){
            health = 0;
            System.out.println(getName() + " погиб");
        }
        this.health -= Math.min(health, damage);
        System.out.println(name + " получил урон " + damage + ". Осталось " + health);
    }
    public void setHealth(int health) {
        this.health = health;
    }
    @Override
    public boolean isAlive() {
        return health > 0;
    }
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }


}
