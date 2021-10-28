package com.company.business.concrete;

import com.company.business.abstracts.OrderIteamManager;
import com.company.dao.abstracts.OrderIteamDao;
import com.company.entities.concrete.OrderIteam;

import java.util.List;

public class OrderIteamService implements OrderIteamManager {

    private OrderIteamDao orderIteamDao;

    public OrderIteamService (OrderIteamDao orderIteamDao){
        this.orderIteamDao=orderIteamDao;
    }


    @Override
    public List<OrderIteam> getByOrderDetailId(int orderId) {
        return orderIteamDao.getByOrderDetailId(orderId);
    }

    @Override
    public void add(OrderIteam orderIteam) {

        orderIteamDao.add(orderIteam);
    }
}
