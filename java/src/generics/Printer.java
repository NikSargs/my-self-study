package generics;

import java.io.Serializable;

public class Printer <T extends Animal & Serializable>{
    T thingToPrint;

    public Printer(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }
    public void print(){
        System.out.println(thingToPrint);
    }
}
