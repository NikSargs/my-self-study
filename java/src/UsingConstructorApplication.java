class MyClass3{
    int number;
    char symbol;

    MyClass3() {
        number = 100;
        symbol = 'A';
    }
    MyClass3(int n, char s) {
        number = n;
        symbol = s;

    }
    void show(){
        System.out.println(number + " " + symbol);
    }
}
class UsingConstructorDemo {

    public static void main(String[] args) {
        MyClass3 objA = new MyClass3();
        MyClass3 objB = new MyClass3(200, 'B');
        System.out.println("objA");
        objA.show();
        System.out.println("objB");
        objB.show();
    }
}
