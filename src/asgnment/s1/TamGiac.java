package asgnment.s1;

public class TamGiac {
    private float canh1;
    private float canh2;
    private float canh3;

    public TamGiac() {
    }

    public float getCanh1() {
        return canh1;
    }

    public void setCanh1(float canh1) {
        this.canh1 = canh1;
    }

    public float getCanh2() {
        return canh2;
    }

    public void setCanh2(float canh2) {
        this.canh2 = canh2;
    }

    public float getCanh3() {
        return canh3;
    }

    public void setCanh3(float canh3) {
        this.canh3 = canh3;
    }

    public boolean kiemTraTamGiac(){
        if(getCanh1()+getCanh2()>getCanh3() && getCanh2()+getCanh3()>getCanh1() && getCanh1()+getCanh3()>getCanh2()){
            return true;
        }
        return false;
    }

    public float chuVi(){
        return getCanh1()+getCanh2()+getCanh3();
    }

    public double dienTich(){
        float p = chuVi()/2;
        return  Math.sqrt(p*(p-getCanh1())*(p-getCanh2())*(p-getCanh3()));
    }
}
