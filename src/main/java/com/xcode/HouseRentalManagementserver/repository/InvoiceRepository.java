package com.xcode.HouseRentalManagementserver.repository;

import com.xcode.HouseRentalManagementserver.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
