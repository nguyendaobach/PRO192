package Lab3;

import java.util.Scanner;

public class Personn {
    Scanner sc=new Scanner(System.in);
    private String email;
    private String hoten;
    private int age;
    private int phonenum;
    private String diachi;

    /*public Personn(String email, String hoten, int age, int phonenum, String diachi) {
        this.email = email;
        this.hoten = hoten;
        this.age = age;
        this.phonenum = phonenum;
        this.diachi = diachi;
    }*/

  void setemploy(){
      System.out.println("nhap email");
      email=sc.nextLine();
      System.out.println("nhap hoten");
      hoten=sc.nextLine();
      System.out.println("nhap tuoi");
      age=sc.nextInt();
      System.out.println("nhap sdt");
      phonenum=sc.nextInt();
      sc.nextLine();
      System.out.println("nhap dia chi");
      diachi=sc.nextLine();
  }

    public void Infomation(){
        System.out.println("Email:"+email);
        System.out.println("Hoten:"+hoten);
        System.out.println("Age:"+age);
        System.out.println("Phonenum:0"+phonenum);
        System.out.println("Dia chi:"+diachi);
    }
    public void changenum(){
        System.out.println("Vui long nhap sdt moi");
        int newphonenum=sc.nextInt();
        phonenum=newphonenum;
        sc.nextLine();
    }
    public void changediachi(){
        System.out.println("Vui long nhap dia chi moi");
        String diachimoi=sc.nextLine();
        diachi=diachimoi;


    }
}
