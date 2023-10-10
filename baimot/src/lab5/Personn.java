package lab5;

public abstract class Personn {
    protected String email;
    protected String hoten;

    protected int age;
    protected int phonenum;
    protected String diachi;

    public Personn(String email, String hoten, int age, int phonenum, String diachi) {
        this.email = email;
        this.hoten = hoten;
        this.age = age;
        this.phonenum = phonenum;
        this.diachi = diachi;
    }

    public abstract void Infomation();

    public String getEmail() {
        return email;
    }
}

