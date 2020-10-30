package com.xcode.HouseRentalManagementserver.service;

import com.xcode.HouseRentalManagementserver.model.Tenant;

import java.util.List;
import java.util.Optional;

public interface TenantService {

    List<Tenant> getAllTenant();

    Optional<Tenant> findByTenantId(long tenantId);

    Tenant saveTenant(Tenant tenant);

    void deleteTenant(long tenantId);

}
