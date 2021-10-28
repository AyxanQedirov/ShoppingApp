package com.company.business.concrete;

import com.company.business.abstracts.OrderDetailManager;
import com.company.dao.abstracts.OrderDetailDao;
import com.company.dao.abstracts.OrderIteamDao;
import com.company.entities.concrete.OrderDetail;

import java.util.List;

public class OrderDetailService implements OrderDetailManager {

    private OrderDetailDao orderDetailDao;

    public OrderDetailService(OrderDetailDao orderDetailDao){
        this.orderDetailDao=orderDetailDao;

    }

    @Override
    public List<OrderDetail> getAll() {
        return orderDetailDao.getAll();
    }

    @Override
    public void add(OrderDetail orderDetail) {
        orderDetailDao.add(orderDetail);

    }
}
