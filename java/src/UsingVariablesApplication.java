import javax.swing.JOptionPane;
public class UsingVariablesApplication {

    public static void main(String[] args) {
        int number = 123;

        double x = 32.1;

        char symb = 'A';

        boolean state = true;

        String text = "Используемые переменные\n";

        text = text + "Целое число: " + number + "\n";

        text = text + "Действительное число: " + x + "\n";

        text = text + "Символ: " + symb + "\n";

        text = text + "Логическое значение: " + state;

        JOptionPane.showMessageDialog(null, text);
    }

}
