package songuyento.labs2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        SoNguyenTo snt = new SoNguyenTo();
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so bat ky: ");
        x = sc.nextInt();
        snt.setA(x);

        if(snt.isSoNguyenTo(x)==true){
            System.out.println(x+ " La so nguyen to.");
            System.out.println("SNT Tiep Theo La: "+snt.timSoNguyenToTiepTheo());
        }else
            System.out.println(x+ " Khong phai la so nguyen to");

    }
}
