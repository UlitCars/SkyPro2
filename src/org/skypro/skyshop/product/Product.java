package org.skypro.skyshop.product;

public class Product {
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    private int price;
    public void setPrice(int price) {
        this.price = price;
    }
    public  int getPrice(){
        return price;
    }
}
