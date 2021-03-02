package lab.ss5;

import java.util.ArrayList;
import java.util.Scanner;

public class GiaoVien extends Person {
    String mucluong;
    String somongiangday;
    String cacmongiangday;
    ArrayList<Person> danhsachlopgiangday;

    public GiaoVien() {
        danhsachlopgiangday = new ArrayList<Person>();
    }

    public String getMucluong() {
        return mucluong;
    }

    public void setMucluong(String mucluong) {
        this.mucluong = mucluong;
    }

    public String getSomongiangday() {
        return somongiangday;
    }

    public void setSomongiangday(String somongiangday) {
        this.somongiangday = somongiangday;
    }

    public String getCacmongiangday() {
        return cacmongiangday;
    }

    public void setCacmongiangday(String cacmongiangday) {
        this.cacmongiangday = cacmongiangday;
    }


    public void inputPerson() {
        super.inputtt();
        Scanner p = new Scanner(System.in);
        System.out.println("muc luong: ");
        setMucluong(p.nextLine());
        System.out.println("so mon giang day: ");
        setSomongiangday(p.nextLine());
        System.out.println("cac mon giang day: ");
        setCacmongiangday(p.nextLine());
    }
    public void addDanhSach(Person ds){
        danhsachlopgiangday.add(ds);
    }

    public void printPerson() {
        super.printtt();
        System.out.println("muc luong: " + getMucluong());
        System.out.println("so mon giang day: " + getSomongiangday());
        System.out.println("cac mon giang day: " + getCacmongiangday());
    }

}
