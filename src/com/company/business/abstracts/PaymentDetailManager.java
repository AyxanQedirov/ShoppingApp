package com.company.business.abstracts;

import com.company.entities.concrete.PaymentDetail;

import java.util.List;

public interface PaymentDetailManager {

    List<PaymentDetail> getAll();

    PaymentDetail getById(int id);

    void add(PaymentDetail paymentDetail);
}
