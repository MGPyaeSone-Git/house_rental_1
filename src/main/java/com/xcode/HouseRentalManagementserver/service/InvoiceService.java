package com.xcode.HouseRentalManagementserver.service;


import com.xcode.HouseRentalManagementserver.model.Invoice;

import java.util.List;
import java.util.Optional;

public interface InvoiceService {

    List<Invoice> getAllInvoice();

    Optional<Invoice> findByInvoiceId(long invoiceId);

    Invoice saveInvoice(Invoice invoice);

    void deleteInvoice(long invoiceId);

}
