package Drumkit;

public class DrumKitTestDrive {

    public static void main(String[] args){
        DrumKit d = new DrumKit();
        if(d.share == true) {
            d.playShare();
            d.playTopHat();
        }
    }
}
