package com.xcode.HouseRentalManagementserver.service;

import com.xcode.HouseRentalManagementserver.model.Payment;

import java.util.List;
import java.util.Optional;

public interface PaymentService {

    List<Payment> getAllPayment();

    Optional<Payment> findByPaymentId(long paymentId);

    Payment savePayment(Payment payment);

    void deletePayment(long paymentId);

}
