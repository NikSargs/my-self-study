import javax.swing.JOptionPane;
public class InputDialogDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String text = JOptionPane.showInputDialog("Ведите текст");
        
        JOptionPane.showMessageDialog(null, "Вы ввели такой текст:\n" + text);
        
    }
    
}
