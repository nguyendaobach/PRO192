package lab4;

import java.util.Scanner;

public class Personn {
    private String email;
    private String hoten;

    private int age;
    private int phonenum;
    private String diachi;

    public Personn(String email, String hoten, int age, int phonenum, String diachi) {
        this.email = email;
        this.hoten = hoten;
        this.age = age;
        this.phonenum = phonenum;
        this.diachi = diachi;
    }
    public void Infomation(){
        System.out.println("Email:"+email);
        System.out.println("Hoten:"+hoten);
        System.out.println("Age:"+age);
        System.out.println("Phonenum:0"+phonenum);
        System.out.println("Dia chi:"+diachi);
    }
}

