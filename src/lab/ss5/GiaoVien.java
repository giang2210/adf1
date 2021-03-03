package lab.ss5;

import lab.s4_2.LopHoc;

import java.util.ArrayList;
import java.util.Scanner;

public class GiaoVien extends Person {
    double mucLuong;
    int soMonGiangDay;
    ArrayList <String>cacMonGiangDay;
    ArrayList<String> danhSachLopGiangDay;

    public GiaoVien() {
        danhSachLopGiangDay = new ArrayList<String>();
        cacMonGiangDay = new ArrayList<String>();
    }
    public double getMucLuong() {
        return mucLuong;
    }

    public void setMucLuong(double mucLuong) {
        this.mucLuong = mucLuong;
    }

    public int getSoMonGiangDay() {
        return soMonGiangDay;
    }

    public void setSoMonGiangDay(int soMonGiangDay) {
        this.soMonGiangDay = soMonGiangDay;
    }

    {
    }


    public void nhapGiaoVien() {
        super.inputtt();
        Scanner p = new Scanner(System.in);
        System.out.println("muc luong: ");
        setMucLuong(p.nextDouble());
        System.out.println("so mon giang day: ");
        setSoMonGiangDay(p.nextInt());
        p.nextLine();
        System.out.println("Danh sach cac mon: ");
        for (int i = 0; i < getSoMonGiangDay(); i++) {
         danhSachLopGiangDay.add(p.nextLine());
        }
        System.out.println("so lop day: ");
        int sl = p.nextInt();
        p.nextLine();
        System.out.println("danh sách lớp: ");
        for (int i = 0; i < sl; i++) {
            danhSachLopGiangDay.add(p.nextLine());
        }
    }
    public void showInfo(){
        super.printtt();
        System.out.println("muc luong: "+getMucLuong());
        System.out.println("so mon hoc: "+getSoMonGiangDay());
        System.out.println("danh sach mon hoc: ");
        for (String s : cacMonGiangDay) {
            System.out.println(s);
        }
        System.out.println("danh sach lop hoc: ");
        for (String s: danhSachLopGiangDay){
            System.out.println(s);
        }
    }


    }

