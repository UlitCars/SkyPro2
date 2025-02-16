package org.skypro.skyshop;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.basket.ProductBasket;

public class App {
    public static void main(String[] args) {
        Product bread = new Product();
        bread.setName("Хлеб");
        bread.setPrice(50);
        Product milk = new Product();
        Product bananas = new Product();
        Product cheese = new Product();
        Product waffles = new Product();
        Product fish = new Product();
        bananas.setName("Бананы");
        cheese.setName("Сыр");
        waffles.setName("Вафли");
        fish.setName("Рыба");
        milk.setName("Молоко");
        milk.setPrice(120);
        cheese.setPrice(320);
        waffles.setPrice(110);
        fish.setPrice(340);
        bananas.setPrice(180);
        ProductBasket test = new ProductBasket();
        test.addProduct(bread);
        test.addProduct(bananas);
        test.addProduct(milk);
        test.addProduct(cheese);
        test.addProduct(waffles);
        test.addProduct(fish);
        test.printBasket();
        System.out.println(test.basketSum());
        System.out.println(test.availability("Рыба"));
        System.out.println(test.availability("Молоко"));
        test.clean();
        test.printBasket();
        System.out.println(test.basketSum());
        System.out.println(test.availability("Молоко"));

    }
}
