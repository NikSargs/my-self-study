package UsingIfApp;
import javax.swing.*;
public class UsingIfDemo {
    public static void main(String[] args) {
        String input, txt, title;

        int number;

        ImageIcon img;

        input = JOptionPane.showInputDialog(null, "Введите целое число", "Проверка числа", JOptionPane.QUESTION_MESSAGE);
        if(input == null){
            JOptionPane.showMessageDialog(null, "Not number", "error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        number=Integer.parseInt(input);
        if (number % 2 == 0) {
            img = new ImageIcon("C:/Users/Пользователь/Pictures/352877.jpg");
            txt = "Число " + number + " - четное!";
            title = "Четное число";
        }
        else {
            img = new ImageIcon("C:/Users/Пользователь/Pictures/Teddie_render.png");
            txt = "Число "+ number + "- нечетное";
            title = "Нечетное число";
        }
        JOptionPane.showMessageDialog(null, txt, title, JOptionPane.PLAIN_MESSAGE, img);
    }
}
