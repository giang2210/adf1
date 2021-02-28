package lab.s1;

public class Main {
    public static void main(String[] args) {
        Product pr1 = new Product();
        Product pr2 = new Product();
        Product pr3 = new Product();

        pr1.id = 1;
        pr1.productName = ("SP so 1");
        pr1.qty = 20;
        pr1.price = 15.00;
        pr1.unit = "Chiếc";
        pr1.changeQty(4);
        pr1.changePrice(20);
        if (pr1.checkStock()) {
            System.out.println("San pham " + pr1.productName + " con " + pr1.qty + " sp");
        } else {
            System.out.println("San pham " + pr1.productName + " het hang");
        }
    }
}
