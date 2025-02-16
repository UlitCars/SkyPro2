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
        } System.out.println("Невозможно добавить продукт");
    }
    public int basketSum () {
            int basketSum = 0;
            for (int i = 0; i < basket.length; i++) {
                if (basket[i] != null) {
                    basketSum += basket[i].getPrice();
                } else break;
            }
            return basketSum;
        }
        public void printBasket () {
            for (int i = 0; i < basket.length; i++) {
                if (basket[i] != null) {
                    System.out.println(basket[i].getName() + " : " + basket[i].getPrice() + "р");
                } else {
                    if (basketSum() == 0) {
                        System.out.println("Корзина пуста");
                        break;
                    } else {
                        System.out.println("Итого: " + basketSum());
                    }
                }
            }
        }
        public boolean availability (String name) {
            boolean a = false;
            for (int i = 0; i < basket.length; i++) {
                if (basketSum() == 0) {
                    System.out.println("Корзина пуста");
                    break;
                } else {
                    if (basket[i].getName().equals(name)) {
                        a = true;
                    }
                }
            }return a;
        }
        public void clean () {
            for (int i = 0; i < basket.length; i++) {
                basket[i] = null;

            }
        }
    }