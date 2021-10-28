package com.company.dao.abstracts;

import com.company.business.abstracts.PaymentDetailManager;
import com.company.entities.concrete.PaymentDetail;

import java.util.List;

public interface PaymentDetailDao  {

    List<PaymentDetail> getAll();

    PaymentDetail getById(int id);

    void add(PaymentDetail paymentDetail);

}
