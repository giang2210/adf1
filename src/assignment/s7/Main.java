package assignment.s7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        ArrayList<SinhVien> dsSv = new ArrayList<>();
        boolean run = true;
        do{
            System.out.println("Chon chuc nang:");
            System.out.println("1. Them SV");
            System.out.println("2. Sua SV");
            System.out.println("3. Xoa SV");
            System.out.println("4. Sap xep theo GPA");
            System.out.println("5. Sap xep theo Ten");
            System.out.println("6. Xem danh sach");
            System.out.println("0. Thoat");
            Scanner sc = new Scanner(System.in);
            int c = sc.nextInt();
            if(c == 0){
                run = false;
            }else if(c == 1){
                System.out.println("NHap id sv:");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.println("NHap ten sv:");
                String name = sc.nextLine();
                System.out.println("NHap tuoi sv:");
                int age = sc.nextInt();
                System.out.println("NHap dia chi sv:");
                sc.nextLine();
                String address = sc.nextLine();
                System.out.println("NHap GPA sv:");
                float gpa = sc.nextFloat();
                dsSv.add(new SinhVien(id,name,age,address,gpa));
            }else if(c == 2){
                System.out.println("NHap id sv muon sua thong tin:");
                int id = sc.nextInt();
                for (SinhVien s: dsSv){
                    if(id == s.getId()){
                        sc.nextLine();
                        System.out.println("NHap ten sv:");
                        s.setName(sc.nextLine());
                        System.out.println("NHap tuoi sv:");
                        s.setAge(sc.nextInt());
                        System.out.println("NHap dia chi sv:");
                        sc.nextLine();
                        s.setAddress(sc.nextLine());
                        System.out.println("NHap GPA sv:");
                        s.setGpa(sc.nextFloat());
                        break;
                    }
                }
            }else if(c == 3){
                System.out.println("NHap id sv muon xoa thong tin:");
                int id = sc.nextInt();
                for (SinhVien s: dsSv) {
                    if (id == s.getId()) {
                        dsSv.remove(s);
                        break;
                    }
                }
            }else if(c == 4){
                Collections.sort(dsSv, new Comparator<SinhVien>() {
                    @Override
                    public int compare(SinhVien o1, SinhVien o2) {
                        return (o2.getGpa() - o1.getGpa() > 0)?1:-1;
                    }
                });
            }else if(c== 5){
                Collections.sort(dsSv, new Comparator<SinhVien>() {
                    @Override
                    public int compare(SinhVien o1, SinhVien o2) {
                        return o1.getName().compareTo(o2.getName());
                    }
                });
            }else if(c==6){
                for(SinhVien s: dsSv){
                    System.out.println(s.getName()+"-"+s.getGpa());
                }
            }
        }while (run);


    }
}
