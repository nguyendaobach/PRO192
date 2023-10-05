package lab4;

import java.util.ArrayList;
import java.util.Scanner;


public class giangvien extends Personn {
    private ArrayList<String> danhsach =new ArrayList<>();

    public giangvien(String email, String hoten, int age, int phonenum, String diachi, ArrayList<String> danhsach) {
        super(email, hoten, age, phonenum, diachi);
        this.danhsach = danhsach;
    }


    public ArrayList<String> getDanhsach() {
        return danhsach;
    }

    public void setDanhsach(ArrayList<String> danhsach) {
        this.danhsach = danhsach;
    }
    public void themmonhocseday(String themmonhoc){
    danhsach.add(themmonhoc);
    }
    public void hienthimonhoc(){
        for(int i=0;i<danhsach.size();i++){
            System.out.println(danhsach);
        }
    }

}

