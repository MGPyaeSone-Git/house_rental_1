package com.xcode.HouseRentalManagementserver.repository;

import com.xcode.HouseRentalManagementserver.model.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TenantRepository extends JpaRepository<Tenant, Long> {
}
