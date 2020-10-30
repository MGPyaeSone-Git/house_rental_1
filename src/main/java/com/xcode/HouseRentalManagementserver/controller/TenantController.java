package com.xcode.HouseRentalManagementserver.controller;

import com.xcode.HouseRentalManagementserver.model.Tenant;
import com.xcode.HouseRentalManagementserver.service.TenantService;
import com.xcode.HouseRentalManagementserver.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/tenant")
public class TenantController {

    @Autowired
    private TenantService tenantService;

    @GetMapping("/list")
    public ResponseEntity<Map<String, Object>> getAllTent() {
        List<Tenant> results = tenantService.getAllTenant();
        Map<String, Object> response = ResponseUtil.list("Successfully retrieved!", results);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @PostMapping("/create")
    public ResponseEntity<Map<String, Object>> createTenant(@RequestBody Tenant tenant) {
        Tenant result = tenantService.saveTenant(tenant);
        Map<String, Object> response = ResponseUtil.retrieve("Successfully created!", result);
        return  ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}
