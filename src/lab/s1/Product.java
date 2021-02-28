package lab.s1;

public class Product {
    int id;
    String productName;
    double price;
    int qty;
    String unit;

    void changeQty(int q){
        qty += q;
    }

    void changePrice(double p){
        price = p;
    }

    boolean checkStock(){
        if(qty>0) return true;
        return false;
    }
}
