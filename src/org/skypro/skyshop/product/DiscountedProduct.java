package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {
    private int basePrice;
    private int discount;

    public DiscountedProduct(String name, int basePrice, int discount) {
        super(name);
        this.basePrice = basePrice;
        this.discount = discount;
    }

    @Override
    public int getPrice() {
        int discountedPrice = (int) (((double) discount / 100) * basePrice);
        return basePrice - discountedPrice;
    }

    @Override
    public String toString() {
        return String.format("%s: %d (%d)", getName(), this.getPrice(), discount);
    }

    @Override
    public boolean isSpecial() {
        return true;
    }
}

