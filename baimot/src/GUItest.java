
import javax.swing.JOptionPane;
public class GUItest {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null,"hello "+name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your old"));
        JOptionPane.showMessageDialog(null,"You are "+age+" years old");
        JOptionPane.showMessageDialog(null,"Your name is "+name+" and you are "+age+" years old");
    }
}
