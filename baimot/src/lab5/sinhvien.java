package lab5;

public class sinhvien extends Personn{

    public sinhvien(String email, String hoten, int age, int phonenum, String diachi) {
        super(email,hoten,age,phonenum,diachi);

    }

    @Override
    public void Infomation() {
        System.out.println("Email:"+email);
        System.out.println("Hoten:"+hoten);
        System.out.println("Age:"+age);
        System.out.println("Phonenum:0"+phonenum);
        System.out.println("Dia chi:"+diachi);
    }
}
