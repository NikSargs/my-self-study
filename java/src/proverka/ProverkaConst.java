package proverka;

public class ProverkaConst {
    public static void main(String[] args) {

        Level[] levels = new Level[2];
        Home home = new Home(1, levels);

        Apartment[] apartments = new Apartment[1];
        levels[0] = new Level(1, apartments);
        levels[1] = new Level(2, apartments);

        Room[] rooms = new Room[3];
        apartments[0] = new Apartment(1, rooms);

        rooms[0] = new Room(true);
        rooms[1] = new Room(false);
        rooms[2] = new Room(false);

        printAllInformation(home);
    }
    public static void printAllInformation(Home home){
        home.print();
        for (Level level : home.levels) {
            level.print();
            for (Apartment apartment : level.apartments) {
                apartment.print();
                for (Room room : apartment.rooms) {
                    room.print();
                }
            }
        }
    }
}
