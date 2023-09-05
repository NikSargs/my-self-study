package proverka;

public class Home {
    int home;
    Level[] levels;

    public Home(int home, Level[] levels) {
        this.home = home;
        this.levels = levels;
    }
    public void print(){
        System.out.println("Home " + home + ", levels " + levels.length);
    }
}
