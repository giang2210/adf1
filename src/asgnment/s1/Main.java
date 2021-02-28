package asgnment.s1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        // nhap 3 so tu ban phim
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh 1:");
        float c1 = sc.nextFloat();
        System.out.println("Nhap canh 2:");
        float c2 = sc.nextFloat();
        System.out.println("Nhap canh 3:");
        float c3 = sc.nextFloat();

        TamGiac tg = new TamGiac();
        tg.setCanh1(c1);
        tg.setCanh2(c2);
        tg.setCanh3(c3);

        if(tg.kiemTraTamGiac()){
            System.out.println("Chu vi: "+tg.chuVi());
            System.out.println("Dien tich: "+tg.dienTich());
        }
    }
}
