package com.company.business.concrete;

import com.company.business.abstracts.PaymentDetailManager;
import com.company.dao.abstracts.PaymentDetailDao;
import com.company.entities.concrete.PaymentDetail;

import java.util.List;

public class PaymentDetailService implements PaymentDetailManager {

    private PaymentDetailDao paymentDetailDao;

    public PaymentDetailService(PaymentDetailDao paymentDetailDao){
        this.paymentDetailDao=paymentDetailDao;
    }


    @Override
    public List<PaymentDetail> getAll() {
        return paymentDetailDao.getAll();
    }

    @Override
    public PaymentDetail getById(int id) {
        return paymentDetailDao.getById(id);
    }

    @Override
    public void add(PaymentDetail paymentDetail) {
        paymentDetailDao.add(paymentDetail);
    }
}
