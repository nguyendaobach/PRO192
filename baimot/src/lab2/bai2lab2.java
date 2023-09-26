package lab2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class bai2lab2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            int so = sc.nextInt();
        }
        catch (InputMismatchException ime){
            System.out.println("vui long nhap so");
        }finally {
            System.out.println("Ket thuc chuong trinh");
        }
    }
}
