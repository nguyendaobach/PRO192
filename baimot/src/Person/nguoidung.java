package Person;

import java.util.Scanner;

public class nguoidung {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Personn Bach = new Personn("bachndqe180006@fpt.edu.vn","Nguyen Dao Bach",18, 389116428,"Binh Dinh");
        Bach.Infomation();
        Bach.changenum(Bach.getPhonenum());
        Bach.changediachi(Bach.getDiachi());
        System.out.println("Thong tin sau khi thay doi");
        Bach.Infomation();
    }
}
