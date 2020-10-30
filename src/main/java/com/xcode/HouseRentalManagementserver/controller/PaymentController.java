package com.xcode.HouseRentalManagementserver.controller;

import com.xcode.HouseRentalManagementserver.model.Payment;
import com.xcode.HouseRentalManagementserver.service.PaymentService;
import com.xcode.HouseRentalManagementserver.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/list")
    public ResponseEntity<Map<String, Object>> getAllPayment() {
        List<Payment> results = paymentService.getAllPayment();
        Map<String, Object> response = ResponseUtil.list("Successfully retrieved!", results);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @PostMapping("/create")
    public ResponseEntity<Map<String, Object>> createPayment(@RequestBody Payment payment) {
        Payment result = paymentService.savePayment(payment);
        Map<String, Object> response = ResponseUtil.retrieve("Successfully created!", result);
        return  ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}
