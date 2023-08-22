package proverka;

public class Room {
    boolean room;

    public Room(boolean room) {
        this.room = room;
    }
    public void print(){
        if (room) {
            System.out.println("room is through");
        } else {
            System.out.println("room is not trough");
        }

    }
}
