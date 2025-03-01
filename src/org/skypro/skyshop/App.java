package org.skypro.skyshop;

import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.SimpleProduct;

public class App {
    public static void main(String[] args) {
        ProductBasket test = new ProductBasket();
        Product toaster = new FixPriceProduct("Тостер");
        Product book = new DiscountedProduct("Книга", 500, 10);
        Product phone = new DiscountedProduct("Телефон", 5000, 15);
        Product table = new FixPriceProduct("Стол");
        Product pen = new FixPriceProduct("Ручка");
        test.addProduct(toaster);
        test.addProduct(book);
        test.addProduct(phone);
        test.addProduct(table);
        test.addProduct(pen);
        test.printBasket();

    }
}
