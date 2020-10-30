package com.xcode.HouseRentalManagementserver.service;

import com.xcode.HouseRentalManagementserver.model.Payment;
import com.xcode.HouseRentalManagementserver.repository.PaymentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public List<Payment> getAllPayment() {
        return paymentRepository.findAll();
    }

    @Override
    public Optional<Payment> findByPaymentId(long paymentId) {
        return paymentRepository.findById(paymentId);
    }

    @Override
    public Payment savePayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public void deletePayment(long paymentId) {
        paymentRepository.deleteById(paymentId);
    }
}
