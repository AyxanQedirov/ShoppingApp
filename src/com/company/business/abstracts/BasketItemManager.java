package com.company.business.abstracts;

import com.company.entities.concrete.BasketItem;

import java.util.List;

public interface BasketItemManager {
    void addToBasket(BasketItem basketItem);

    List<BasketItem> showBasket();

    void clear();

    int calculateBasketTotalPrice();
}
