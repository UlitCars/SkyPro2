package org.skypro.skyshop.product;

public abstract class Product implements Searchable {
    private String name;

    public Product(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public abstract int getPrice();

    public abstract boolean isSpecial();

    @Override
    public String searchTerm() {
        return name;
    }

    @Override
    public String getContentType() {
        return "Product";
    }


}