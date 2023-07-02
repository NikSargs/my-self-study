import javax.swing.JOptionPane;
public class ShowMeNewWindowDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String title = "Сообщение";
        
        String text = "Продолжаем изучать Java";
        
        JOptionPane.showMessageDialog(null, text, title, JOptionPane.WARNING_MESSAGE);
        
    }
    
}
