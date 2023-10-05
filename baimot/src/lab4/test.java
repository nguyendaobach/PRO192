package lab4;

import java.util.ArrayList;

public class test {


    public static void main(String[] args) {
        ArrayList<String> themmonhoc=new ArrayList<>();
        themmonhoc.add("Toan");
        themmonhoc.add("Van");
        themmonhoc.add("Anh");
        ArrayList<String> themhchuyennganh=new ArrayList<>();
        themhchuyennganh.add("Ktpm");
        themhchuyennganh.add("KT");
        giangvien nam=new giangvien("vovannam@fpt.edu.vn","vo van nam",26,123455,"Quy nhonw",themmonhoc);
        nam.hienthimonhoc();
        nam.Infomation();
        sinhvien sv=new sinhvien("nguyendaobach@gmail.com","nguyen dao bach",19,389128,"Quy nhon",themhchuyennganh);
        sv.hienthimonchuyennganh();
        sv.Infomation();

    }

}
