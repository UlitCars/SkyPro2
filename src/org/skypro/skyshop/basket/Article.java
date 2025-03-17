package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Searchable;

public class Article implements Searchable {
    private final String articleName;
    private final String textArticle;

    public Article(String textArticle, String articleName) {
        this.textArticle = textArticle;
        this.articleName = articleName;
    }

    @Override
    public String toString() {
        return "Article{" +
                "articleName='" + articleName + '\'' +
                ", textArticle='" + textArticle + '\'' +
                '}';
    }

    @Override
    public String searchTerm() {
        return articleName + textArticle;
    }

    @Override
    public String getContentType() {
        return "Article";
    }

    @Override
    public String getName() {
        return articleName;
    }
}
