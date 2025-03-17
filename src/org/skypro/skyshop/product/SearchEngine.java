package org.skypro.skyshop.product;

public class SearchEngine {
    Searchable[] searchables = new Searchable[5];
    Searchable[] resultsSearch;

    public Searchable[] search(String term) {
        int quantity = 0;
        for (int i = 0; i < searchables.length && quantity < 5; i++) {
            if (searchables[i].searchTerm().contains(term)) {
                searchables[i] = resultsSearch[i];
                quantity++;
            }
        }
        return resultsSearch;
    }

    public void add(Searchable searchable) {
        for (int i = 0; i < searchables.length; i++) {
            if (searchables[i] == null) {
                searchables[i] = searchable;
            }
        }
    }
}
