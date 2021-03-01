package lab.s4_2;

;

import java.util.ArrayList;

public class LopHoc {
    private int malop;
    private String tenlop;
    private String phonghoc;
    ArrayList<SinhVien> danhsachsinhvien;
    //ham khoi tạo
    public LopHoc() {
        danhsachsinhvien = new ArrayList<SinhVien>();
    }
    //getter setter


    public int getMalop() {
        return malop;
    }

    public void setMalop(int malop) {
        this.malop = malop;
    }

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

    public String getPhonghoc() {
        return phonghoc;
    }

    public void setPhonghoc(String phonghoc) {
        this.phonghoc = phonghoc;
    }
    //them 1 sinh vien
    public ArrayList<SinhVien> Danhsachsinhvien() {
        return danhsachsinhvien;
    }
    public void addSv(SinhVien sv){
        danhsachsinhvien.add(sv);
    }


    public  void removeSv(int index ){
        danhsachsinhvien.remove(index);
    }
    public void  printsv(){
        System.out.println("mã SV:"+getMalop());
        System.out.println("tên sv:"+getTenlop());
        System.out.println("Dien thoai:"+getPhonghoc());
        System.out.println("danh sách sinh viên:");
        for (SinhVien i:danhsachsinhvien){
            System.out.println(i);

        }

    }
}
