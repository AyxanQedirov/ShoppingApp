package com.company.dao.concrete;

import com.company.LocalData;
import com.company.dao.abstracts.BasketItemDao;
import com.company.entities.concrete.BasketItem;

import java.util.List;

public class LocalBasketItemDao implements BasketItemDao {
    @Override
    public void addToBasket(BasketItem basketItem) {
        LocalData.Basket.add(basketItem);
    }

    @Override
    public List<BasketItem> showBasket() {
        return LocalData.Basket;
    }

    @Override
    public void clear() {
        LocalData.Basket.clear();

    }
}
