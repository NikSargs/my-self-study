package Movie;

public class MovieTestDrive {
    public static void main(String[] args){
        Movie one = new Movie();
        one.title = "1st movie";
        one.genre = "Трагедия";
        one.rating = -2;

        Movie two = new Movie();
        two.title = "2nd movie";
        two.genre = "Комедия";
        two.rating = 5;
        two.PlayIt();

        Movie three = new Movie();
        three.title = "3rd movie";
        three.genre = "Трагедия";
        three.rating = 127;


    }
}
