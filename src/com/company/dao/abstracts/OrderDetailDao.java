package com.company.dao.abstracts;

import com.company.entities.concrete.OrderDetail;

import java.util.List;

public interface OrderDetailDao {

    List<OrderDetail> getAll();

    void add(OrderDetail orderDetail);
}
