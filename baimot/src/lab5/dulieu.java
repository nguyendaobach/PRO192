package lab5;

public class dulieu {

    private int soNg;
    private Personn[] person;


    public dulieu(){
        soNg = 7;
        person = new Personn[soNg];
        person[0]=new giangvien("vovan@fpt.edu.vn","Vo Van",20,99999,"Quy nhon");
        person[1]=new giangvien("nguyenvan@fpt.edu.vn","Nguyen Van",30,998989898,"binh dinh");
        person[2]=new giangvien("nguyendao@fpt.edu.vn","Nguyen Dao",30,999,"Quang Nam");
        person[3]=new giangvien("nguyenthi@fpt.edu.vn","Nguyen Thi",100,999,"hue");
        person[4]=new sinhvien("nguyendao@fpt.edu.vn","Nguyen Dao",10,9999,"Quy nhon");
        person[5]=new sinhvien("nguyentan@fpt.edu.vn","Nguyen Tan",20,999,"Sai Gon");
        person[6]=new sinhvien("nguyenquoc@fpt.edu.vn","Nguyen Quoc",10,100,"Hue");
       }
       public Personn timemail(String email){
            for(int i=0;i<soNg;i++){
                if(person[i].getEmail()==email){
                    return person[i];
                }
            }
            return null;
       }

}
