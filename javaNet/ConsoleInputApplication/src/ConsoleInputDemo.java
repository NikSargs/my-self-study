import java.util.Scanner;
public class ConsoleInputDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in,"Cp1251");
        
        String day, month;
        
        System.out.print("����� ������� ����?");
        
        day = input.nextLine();
        
        System.out.print("����� �����?");
        
        month = input.nextLine();
        
        String text;
        
        text = "������� " + day + ", ����� - " + month;
        
        System.out.println(text);
    }
    
}
