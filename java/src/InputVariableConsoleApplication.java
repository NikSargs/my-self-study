import java.util.Scanner;
public class InputVariableConsoleApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int now = 2023;

        String name;

        int age;

        double height;

        double mass;

        System.out.print("Ваше имя: ");

        name = input.nextLine();

        System.out.print("Ваш возраст: ");

        age = input.nextInt();

        System.out.print("Ваш рост(в метрах): ");

        height = input.nextDouble();

        System.out.print("Масса тела (в килограммах): ");

        mass = input.nextDouble();

        double bmi = mass/height/height;

        System.out.println("Здраствуйте, " + name + " !");

        System.out.println("Вы родиилсь в " + (now - age) + " году.");

        System.out.printf("Ваш индекс массы тела: %5.2f\n", bmi);
    }

}
