package proverka;

public class Level {
    int level;

    Apartment[] apartments;
    public Level(int level, Apartment[] apartments) {
        this.level = level;
        this.apartments = apartments;
    }
    public void print(){
        System.out.println("Level " + level + ", apartments " + apartments.length);
    }
}
