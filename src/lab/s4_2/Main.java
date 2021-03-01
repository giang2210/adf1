package lab.s4_2;

public class Main {
    public static void main(String[] args) {
        SinhVien r = new SinhVien();
        r.setMaso(1);
        r.setHoten("hoàng sơn");
        r.setDiachi("bắc giang");
        r.setSodienthoai("123444567");


        SinhVien r1 = new SinhVien();
        r1.setMaso(2);
        r1.setHoten("bùi sơn");
        r1.setDiachi("hà nội");
        r1.setSodienthoai("234167877");

        LopHoc r2 = new LopHoc();
        r2.setMalop(1);
        r2.setTenlop("T2008M");
        r2.setPhonghoc("phong so 2");
        r2.addSv(r);
        r2.addSv(r1);
        //c.removeSv(1);

        System.out.println("danh sach sinh vien trong lop:");
        for (SinhVien p : r2.Danhsachsinhvien()){
            System.out.println(p.getMaso()+"-"+ p.getHoten()+"-"+p.getDiachi()+"-"+p.getSodienthoai());
        }
        }
    }
