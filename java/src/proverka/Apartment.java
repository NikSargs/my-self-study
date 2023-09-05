package proverka;

public class Apartment {

    int apartment;

    Room[] rooms;
    public Apartment(int apartment, Room[] rooms) {
        this.apartment = apartment;
        this.rooms = rooms;
    }
    public void print(){
        System.out.println("Apartment " + apartment + ", rooms " + rooms.length);
    }
}
