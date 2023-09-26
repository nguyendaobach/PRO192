import java.util.Scanner;
import java.util.Calendar;
import javax.swing.JOptionPane;
public class matkhau {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int cout=0;
        while(true){
            if(cout==5){
                System.out.println("ban da het luot nhap mk");
                break;
            }
            System.out.println("vui long nhap mk");
            String mk= scanner.nextLine();
            if(check(mk)){
                System.out.println("hop le");
                break;
            }else {
                System.out.println("Mk khong hop le");
                cout++;
            }
        }
    }
    public static boolean check(String password) {
        boolean checki = false;
        boolean checso = false;
        boolean checklenght= false;
        if (password.length() < 6)
            return false;

        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) <= 'Z' && password.charAt(i) >= 'a') {
                checki = true;
                break;
            }
        }
        for (int j = 0; j < password.length(); j++) {
            if (password.charAt(j) <= '9' && password.charAt(j) >= '0') {
                checso = true;
                break;
            }

        }
        if(checki||checso){
            return true;
        }
        else return false;
    }}
