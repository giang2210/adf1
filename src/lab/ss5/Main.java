package lab.ss5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /*Person t = new Person();
        t.inputtt();
        t.printtt();
*/

           /* Student t2 = new Student();
            t2.inputPerson();
            t2.printtt();
            t2.kiemtra();*/
        ArrayList<GiaoVien> danhsachlopgiangday = new ArrayList<>();
        Scanner p = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            GiaoVien t4 = new GiaoVien();
            System.out.println("ten: ");
            t4.setTen(p.nextLine());
            System.out.println("gioi tinh: ");
            t4.setGioitinh(p.nextLine());
            System.out.println("ngay sinh: ");
            t4.setNgaysinh(p.nextLine());
            System.out.println("dia chi: ");
            t4.setDiachi(p.nextLine());
            System.out.println("muc luong: ");
            t4.setMucluong(p.nextLine());
            System.out.println("so mon giang day: ");
            t4.setSomongiangday(p.nextLine());
            System.out.println("cac mon giang day: ");
            t4.setCacmongiangday(p.nextLine());


            danhsachlopgiangday.add(t4);

        }
        p.close();
        System.out.println("danh sach lop giang day: ");
        for (GiaoVien giaovien : danhsachlopgiangday) {
            System.out.println(giaovien.toString());
        }




    }

}
