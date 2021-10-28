package com.company.dao.abstracts;

import com.company.entities.concrete.OrderIteam;

import java.util.List;

public interface OrderIteamDao {
    List<OrderIteam> getByOrderDetailId(int orderId);

    void add(OrderIteam orderIteam);
}
