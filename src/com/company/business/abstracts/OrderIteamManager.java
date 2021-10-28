package com.company.business.abstracts;

import com.company.entities.concrete.OrderIteam;

import java.util.List;

public interface OrderIteamManager {

    List<OrderIteam> getByOrderDetailId(int orderId);

    void add(OrderIteam orderIteam);
}
