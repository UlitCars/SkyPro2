package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private Product[] basket = new Product[5];

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

    public boolean availability(String name) {
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] != null && basket[i].getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void clean() {
        int i = 0;
        while (i < basket.length) {
            basket[i] = null;
            i++;
        }
    }
    public void printBasket() {
        int specialCount = 0;
        if (basket.length == 0) {
            System.out.println("В корзине пусто");
        } else {
            for (Product product: basket) {
                System.out.println(product);
                if (product != null && product.isSpecial()) {
                    specialCount++;
                }
            }
            System.out.println("Итого: " + basketSum());
            System.out.println("Специальных товаров: " + specialCount);
        }
    }
}