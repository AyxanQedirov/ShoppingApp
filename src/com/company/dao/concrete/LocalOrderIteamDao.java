package com.company.dao.concrete;

import com.company.LocalData;
import com.company.dao.abstracts.OrderIteamDao;
import com.company.entities.concrete.OrderIteam;

import java.util.List;
import java.util.stream.Collectors;

public class LocalOrderIteamDao implements OrderIteamDao {
    @Override
    public List<OrderIteam> getByOrderDetailId(int orderId) {
        return LocalData.orderIteamsTable.stream().filter(oi->oi.getOrderId()==orderId).collect(Collectors.toList());
    }

    @Override
    public void add(OrderIteam orderIteam) {

        LocalData.orderIteamsTable.add(orderIteam);

    }
}
