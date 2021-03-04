package assignment.s6;

public class Main {
    public static  void main(String[] args){
        MonHocDaiCuong mh = new MonHocDaiCuong();
        mh.themLopHoc("t2008m" , 20);
        mh.themLopHoc("t2006m" , 22);
        mh.themLopHoc("t2038m" , 24);
        mh.printDS();
        mh.sapXep();
        mh.printDS();
    }
}
