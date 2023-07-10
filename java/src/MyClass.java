import javax.swing.JOptionPane;
public class MyClass {
    int number;
    char symbol;

    void set(int n, char s) {
        number = n;
        symbol = s;
    }
    String getInfo(){
        String text = "Число: " + number + "\n";
        text += "символ: " + symbol;
        return text;
    }
}
class UsingObjectDemo {
    public static void main(String[] args){
        MyClass objA = new MyClass();
        MyClass objB = new MyClass();

        objA.set(200, 'A');

        objB.set(200, 'B');

        JOptionPane.showMessageDialog(null, objA.getInfo(), "Первый объект", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, objB.getInfo(), "Второй объект", JOptionPane.INFORMATION_MESSAGE);
    }
}
