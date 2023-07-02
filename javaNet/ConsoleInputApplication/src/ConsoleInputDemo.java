import java.util.Scanner;
public class ConsoleInputDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in,"Cp1251");
        
        String day, month;
        
        System.out.print("Какой сегодня день?");
        
        day = input.nextLine();
        
        System.out.print("Какой месяц?");
        
        month = input.nextLine();
        
        String text;
        
        text = "Сегодня " + day + ", месяц - " + month;
        
        System.out.println(text);
    }
    
}
