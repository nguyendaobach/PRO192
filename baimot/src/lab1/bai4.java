package lab1;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        boolean cout = false;
        String[] danhsach = new String[5];
        danhsach[0] = "Nguyen Dao Bach";
        danhsach[1] = "Nguyen Quoc Khang";
        danhsach[2] = "Nguyen Ngoc Toan";
        danhsach[3] = "Nguyen Tan Tien";
        danhsach[4] = "Nguyen Minh Khai";
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (int i = 0; i <= 4; i++) {
            if (name.equals(danhsach[i])) {
                cout=true;
                break;

            }
        }
        if(cout) System.out.println("Yes");
        else System.out.println("No");


    }
}
