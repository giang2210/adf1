package assignment.ss3;

import java.util.ArrayList;

public class Cart {
    private int id;
    ArrayList<String>customer;
    ArrayList<String> Productlist;
    private float grandtotal;
    private String City;
    //tham so
    public  Cart(){
        customer = new ArrayList<String>();
        Productlist = new ArrayList<String>();
    }
    // GETTER SETTER


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getGrandtotal() {
        return grandtotal;
    }

    public void setGrandtotal(float grandtotal) {
        this.grandtotal = grandtotal;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
    //THEM SP
    public void add(String sanpham){Productlist.add(sanpham);}
    // XOA SP
    public void remove(String sanpham){Productlist.remove(sanpham);}
}

