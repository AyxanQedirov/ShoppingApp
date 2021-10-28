package com.company.dao.concrete;

import com.company.LocalData;
import com.company.dao.abstracts.OrderDetailDao;
import com.company.entities.concrete.OrderDetail;

import java.util.List;

public class LocalOrderDetailDao implements OrderDetailDao {
    @Override
    public List<OrderDetail> getAll() {
        return LocalData.orderDetailsTable;
    }

    @Override
    public void add(OrderDetail orderDetail) {

        LocalData.orderDetailsTable.add(orderDetail);
    }
}
