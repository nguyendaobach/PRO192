package lab4;

import java.util.ArrayList;

public class sinhvien extends Personn {
    ArrayList<String> chuyennganh=new ArrayList<>();

    public sinhvien(String email, String hoten, int age, int phonenum, String diachi, ArrayList<String> chuyennganh) {
        super(email, hoten, age, phonenum, diachi);
        this.chuyennganh = chuyennganh;
    }
    public void themchuyennganh(String mon){
        chuyennganh.add(mon);
    }
    public void hienthimonchuyennganh(){
        for(int i=0;i<chuyennganh.size();i++){
            System.out.println(chuyennganh);
        }
    }
}


