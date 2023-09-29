package Lab3;

import java.util.Scanner;

public class nguoidung {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //Personn Bach = new Personn("bachndqe180006@fpt.edu.vn","Nguyen Dao Bach",18, 389116428,"Binh Dinh");
        Personn Bach=new Personn();
        Bach.setemploy();
        Bach.Infomation();
        Bach.changenum();
        Bach.changediachi();
        System.out.println("Thong tin sau khi thay doi");
        Bach.Infomation();
    }
}
