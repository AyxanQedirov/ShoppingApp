package com.company.business.concrete;

import com.company.LocalData;
import com.company.business.abstracts.BasketItemManager;
import com.company.business.abstracts.ProductManager;
import com.company.dao.abstracts.BasketItemDao;
import com.company.entities.concrete.BasketItem;

import java.util.List;

public class BasketIteamService implements BasketItemManager {

    BasketItemDao basketItemDao;
    ProductManager productManager;

    public BasketIteamService(BasketItemDao basketItemDao ,ProductManager productManager ){
        this.basketItemDao=basketItemDao;
        this.productManager=productManager;

    }

    @Override
    public void addToBasket(BasketItem basketItem) {

        basketItemDao.addToBasket(basketItem);
    }

    @Override
    public List<BasketItem> showBasket() {

        return basketItemDao.showBasket();
    }

    @Override
    public void clear() {
        basketItemDao.clear();

    }

    @Override
    public int calculateBasketTotalPrice() {

        int totalPrice=0;
        for (BasketItem basketItem:basketItemDao.showBasket()) {
            totalPrice=(int)(totalPrice+(productManager.getById(basketItem.getId()).getPrice())*basketItem.getCountOfProduct());
        }

        return totalPrice;

    }
}
