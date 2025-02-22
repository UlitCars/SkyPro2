package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    Product[] basket = new Product[5];

    public void addProduct(Product product) {
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] == null) {
                basket[i] = product;
                return;
            }
        }
        System.out.println("Невозможно добавить продукт");
    }

    public int basketSum() {
        int basketSum = 0;
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] != null) {
                basketSum += basket[i].getPrice();
            } else break;
        }
        return basketSum;
    }

    public void printBasket() {
        int basketSum = 0;
        boolean flag = false;
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] != null) {
                System.out.println(basket[i].getName() + " : " + basket[i].getPrice() + "р");
                flag = true;
                basketSum += basket[i].getPrice();
            }
        }
        if (flag) {
            System.out.println("Итого: " + basketSum);
        } else {
            System.out.println("Корзина пуста");
        }
    }

    public boolean availability(String name) {
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] != null && basket[i].getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void clean() {
        for (int i = 0; i < basket.length; i++) {
            basket[i] = null;
        }
    }
}