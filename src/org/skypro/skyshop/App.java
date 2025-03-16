package org.skypro.skyshop;

import org.skypro.skyshop.basket.Article;
import org.skypro.skyshop.product.*;
import org.skypro.skyshop.basket.ProductBasket;

public class App {
    public static void main(String[] args) {
        ProductBasket test = new ProductBasket();
        Product toaster = new FixPriceProduct("Тостер");
        Product book = new DiscountedProduct("Книга", 500, 10);
        Product phone = new DiscountedProduct("Телефон", 5000, 15);
        Product table = new FixPriceProduct("Стол");
        Product pen = new FixPriceProduct("Ручка");
        Article article = new Article("Текст статьи.", "Название статьи.");
        test.addProduct(toaster);
        test.addProduct(book);
        test.addProduct(phone);
        test.addProduct(table);
        test.addProduct(pen);
        test.printBasket();
        SearchEngine searchEngine = new SearchEngine();
        searchEngine.add(book);
        searchEngine.add(phone);
        searchEngine.add(pen);
        searchEngine.add(article);
        searchEngine.add(table);
        searchEngine.search("pen");
        System.out.println(searchEngine.search("book"));
    }
}
