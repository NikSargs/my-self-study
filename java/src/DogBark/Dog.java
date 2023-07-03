package DogBark;

public class Dog {
    int size;
    String name;

    void bark(int numOfBarks) {
        while (numOfBarks > 0) {
            System.out.println("Гав");
            numOfBarks -= 1;
        }
        if (size > 60) {
            System.out.println("Гав гав");
        } else if (size > 14) {
            System.out.println("вуф вуф");
        } else {
            System.out.println("тяф тяф");
        }
    }
}
