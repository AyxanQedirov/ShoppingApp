package com.company.dao.abstracts;

import com.company.entities.concrete.BasketItem;

import java.util.List;

public interface BasketItemDao {

    void addToBasket(BasketItem basketItem);

    List<BasketItem> showBasket();

    void clear();


}
