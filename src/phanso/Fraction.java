package phanso;

import java.util.Scanner;
public class Fraction {
    // Các thuộc tính: Tử số, mẫu số.
    private int ts;
    private int ms;
    //Hàm tạo không đối số
    Fraction(){
        ts=0;
        ms=1;
    }
    // Hàm tạo hai đối số
    Fraction(int ts,int ms){
        this.ts = ts;
        this.ms = ms;
    }
    // Các phương thức setter và getter.
    public int getTu() { return ts; }
    public void setTu(int ts) { this.ts = ts; }
    public int getMau() { return ms; }
    public void setMau(int ms) {
        this.ms = ms;
    }
    //Phương thức Nhập phân số
    public void NhapPhanSo(){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap tu so:");
            ts = sc.nextInt();
            System.out.println("Nhap mau so:");
            ms = sc.nextInt();

            if(ms == 0)
                System.out.println("Mau so phai khac 0. Hay kiem tra lai");
        }while (ms == 0);
    }
    //Phương thức In Phân số
    public void inPhanSo(){
        if(ts == 0)
            System.out.print("0");
        else if (ms == 0)
            System.out.print(ts);
        else if(ms < 0 )
            System.out.print("-" + ts + "/" +ms);
        else
            System.out.print(ts + "/" +ms);

    }
    //Phương thức Rút gọn phân số
    public int USCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
    public void rutGon()
    {
        int i= USCLN(this.getTu(),this.getMau());
        this.setTu((int) (this.getTu()/i));
        this.setMau((int) (this.getMau()/i));
    }
    //Phương thức Nghịch đảo phân số
    public void NghichDao(){
        int nd;
        nd = ts;
        ts = ms;
        ms = nd;
    }
    public Fraction gtNghichDao(){
        Fraction nghichdao = new Fraction();
        nghichdao.ts = ms;
        nghichdao.ms = ts;
        return nghichdao;
    }
    //Phương thức add(), sub(), mul(), div() tương ứng để thực hiện cộng, trừ, nhân, chia hai phân số cho nhau.
    // Cong ps
    public Fraction cong(Fraction ps){
        Fraction kq = new Fraction();
        kq.ms = this.ms * ps.ts;
        kq.ts = this.ts * ps.ms + this.ms * ps.ts;
        return kq;
    }
    // tru ps
    public Fraction tru(Fraction ps){
        Fraction kq = new Fraction();
        kq.ms = this.ms * ps.ts;
        kq.ts = this.ts * ps.ms - this.ms * ps.ts;
        return kq;
    }
    // nhan ps
    public Fraction nhan(Fraction ps){
        Fraction kq = new Fraction();
        kq.ms = this.ms * ps.ts;
        kq.ts = this.ts * ps.ms;
        return kq;
    }
    // chia ps
    public Fraction chia(Fraction ps){
        return this.nhan(ps.gtNghichDao());
    }
}