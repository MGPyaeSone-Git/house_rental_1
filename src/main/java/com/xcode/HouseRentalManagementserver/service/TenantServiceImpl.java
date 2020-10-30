package com.xcode.HouseRentalManagementserver.service;

import com.xcode.HouseRentalManagementserver.model.Tenant;
import com.xcode.HouseRentalManagementserver.repository.TenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TenantServiceImpl implements TenantService {

    @Autowired
    private TenantRepository tenantRepository;

    @Override
    public List<Tenant> getAllTenant() {
        return tenantRepository.findAll();
    }

    @Override
    public Optional<Tenant> findByTenantId(long tenantId) {
        return tenantRepository.findById(tenantId);
    }

    @Override
    public Tenant saveTenant(Tenant tenant) {
        return tenantRepository.save(tenant);
    }

    @Override
    public void deleteTenant(long tenantId) {
        tenantRepository.deleteById(tenantId);
    }
}
