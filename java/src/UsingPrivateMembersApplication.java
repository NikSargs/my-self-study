class MyClass4 {
    private static int count = 0;

    private int number;
    private String name;

    MyClass4(String n) {
        count++;
        name = n;
        number=count;
        System.out.println("Создан объект с именем "+ name);
    }

    public void show(){
        System.out.println("Name of object: " + name);
        System.out.println("Number of object: " + number);
        System.out.println("How many objects: " + count);
    }

    public void set(String n){
        name=n;
    }
}

class UsingPrivateMembersDemo {
    public static void main(String[] args) {
        MyClass4 objA = new MyClass4("Alpha");
        MyClass4 objB = new MyClass4("Bravo");
        MyClass4 objC = new MyClass4("Charlie");

        objA.show();
        objB.show();
        objC.show();

        objB.set("Second Object");

        objB.show();
    }
}
