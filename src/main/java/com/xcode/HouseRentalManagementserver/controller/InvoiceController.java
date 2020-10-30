package com.xcode.HouseRentalManagementserver.controller;

import com.xcode.HouseRentalManagementserver.model.Invoice;
import com.xcode.HouseRentalManagementserver.service.InvoiceService;
import com.xcode.HouseRentalManagementserver.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    @GetMapping("/list")
    public ResponseEntity<Map<String, Object>> getAllInvoice() {
        List<Invoice> results = invoiceService.getAllInvoice();
        Map<String, Object> response = ResponseUtil.list("Successfully retrieved!", results);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @PostMapping("/create")
    public ResponseEntity<Map<String, Object>> createInvoice(@RequestBody Invoice invoice) {
        Invoice result = invoiceService.saveInvoice(invoice);
        Map<String, Object> response = ResponseUtil.retrieve("Successfully created!", result);
        return  ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}
