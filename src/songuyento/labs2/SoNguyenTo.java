package songuyento.labs2;

public class SoNguyenTo {
    private int a=2;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if(isSoNguyenTo(a)){
            this.a = a;
        }else {
            System.out.println("Khong set !");
        }
    }

    public static boolean isSoNguyenTo(int x) {
        if (x < 2) {
            return false;
        }
        int squareRoot = (int)Math.sqrt(x);
        for(int i=2;i<=squareRoot;i++){
            if(x%i==0) return false;

        }
        return true;
    }
    public int timSoNguyenToTiepTheo(){
        for (int i = a+1;true;i++){
            if(isSoNguyenTo(i)) {
                setA(i);
                return i;
            }
        }
    }

}