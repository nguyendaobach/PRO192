package Person;

import java.util.Scanner;

public class Personn {
    Scanner sc=new Scanner(System.in);
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(int phonenum) {
        this.phonenum = phonenum;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
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
        this.phonenum=newphonenum;
        sc.nextLine();
    }
    public void changediachi(){
        System.out.println("Vui long nhap dia chi moi");
        String diachimoi=sc.nextLine();
        this.diachi=diachimoi;


    }
}
