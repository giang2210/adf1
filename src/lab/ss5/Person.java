package lab.ss5;

import java.util.Scanner;

public class Person {
   public   String Ten;
   public String Gioitinh;
   public String ngaysinh;
   public String diachi;
    // constructor
    public Person(){

    }
    public Person(String ten, String gioitinh,String ngaysinh, String diachi) {
        Ten = ten;
        Gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
    }
    //GETTER SETTER

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        Gioitinh = gioitinh;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    public void inputtt(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ho va ten: ");
        setTen(sc.nextLine());
        System.out.println("gioi tinh: ");
        setGioitinh(sc.nextLine());
        System.out.println("ngay sinh: ");
        setNgaysinh(sc.nextLine());
        System.out.println("dia chi: ");
        setDiachi(sc.nextLine());

    }
    public void printtt(){
        System.out.println("tên: "+getTen());
        System.out.println("giới tính: "+getGioitinh());
        System.out.println("ngày sinh: "+getNgaysinh());
        System.out.println("diachi: "+getDiachi());

    }

    @Override
    public String toString() {
        return "Person{" +
                "Ten='" + Ten + '\'' +
                ", Gioitinh='" + Gioitinh + '\'' +
                ", ngaysinh='" + ngaysinh + '\'' +
                ", diachi='" + diachi + '\'' +
                '}';
    }
}
