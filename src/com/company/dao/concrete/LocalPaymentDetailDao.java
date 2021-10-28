package com.company.dao.concrete;

import com.company.LocalData;
import com.company.dao.abstracts.PaymentDetailDao;
import com.company.entities.concrete.PaymentDetail;

import java.util.List;
import java.util.stream.Collectors;

public class LocalPaymentDetailDao implements PaymentDetailDao {

    @Override
    public List<PaymentDetail> getAll() {
        return LocalData.paymentDetailTable;
    }

    @Override
    public PaymentDetail getById(int id) {
        return LocalData.paymentDetailTable.stream().filter(pd->pd.getId()==id).collect(Collectors.toList()).get(0);
    }

    @Override
    public void add(PaymentDetail paymentDetail) {
        LocalData.paymentDetailTable.add(paymentDetail);
    }
}
