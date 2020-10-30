package com.xcode.HouseRentalManagementserver.service;

import com.xcode.HouseRentalManagementserver.model.Invoice;
import com.xcode.HouseRentalManagementserver.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Override
    public List<Invoice> getAllInvoice() {
        return invoiceRepository.findAll();
    }

    @Override
    public Optional<Invoice> findByInvoiceId(long invoiceId) {
        return invoiceRepository.findById(invoiceId);
    }

    @Override
    public Invoice saveInvoice(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    @Override
    public void deleteInvoice(long invoiceId) {
        invoiceRepository.deleteById(invoiceId);
    }
}
