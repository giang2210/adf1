package assingment.s3;

public class Product {
   private int id;
   private String productName;
   private int qty;
   private float Price;

    public Product(){
    }
    public Product(String productName){
        this.productName = productName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        this.Price = price;
    }

    public void soluong(){
            if (qty > 0){
                    System.out.println("con hang");
            }else{
                System.out.println("het hang");
            }
    }

}

