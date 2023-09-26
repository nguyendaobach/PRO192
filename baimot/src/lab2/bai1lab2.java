package lab2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class bai1lab2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Vui long nhap so ");
        int so=sc.nextInt();
        System.out.println("Nhap so bi chia");
        int chia= sc.nextInt();
            try{
                int sochia=so/chia;
            }catch (ArithmeticException ae){
                System.out.println("Khong the chia cho 0");

            }finally {
                System.out.println(so);
                System.out.println("so chia la :"+(so/chia));
            }
    }
}
