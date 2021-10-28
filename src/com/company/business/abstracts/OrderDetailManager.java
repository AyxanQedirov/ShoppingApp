package com.company.business.abstracts;

import com.company.entities.concrete.OrderDetail;

import java.util.List;

public interface OrderDetailManager {

    List<OrderDetail> getAll();

    void add(OrderDetail orderDetail);
}
