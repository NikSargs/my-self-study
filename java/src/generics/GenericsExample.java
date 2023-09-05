package generics;



import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericsExample {
    public static void main(String[] args) {
        Printer<Cat> printer = new Printer<>(new Cat());
        printer.print();

        Printer<Dog> printer1 = new Printer<>(new Dog());
        printer1.print();

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat());

        Cat myCat = cats.get(0);

        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        printList(intList);

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat());
        printList(catList);
    }
    private static void printList(List<?> myList){

    }
}
