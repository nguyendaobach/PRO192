package lab1;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args){
        System.out.println("Nhap diem chuyen can "+"\nNhap diem giua ki"+"\nNhap diem cuoi ki");
        Scanner sc=new Scanner(System.in);
        double chuyencan= sc.nextDouble();
        double giuaki= sc.nextDouble();
        double cuoiki=sc.nextDouble();
        System.out.println("Diem hoc phan la "+((chuyencan*0.1)+(giuaki*0.2)+(cuoiki*0.7)));
    }
}
