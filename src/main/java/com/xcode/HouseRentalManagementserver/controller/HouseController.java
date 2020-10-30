package com.xcode.HouseRentalManagementserver.controller;

import com.xcode.HouseRentalManagementserver.model.House;
import com.xcode.HouseRentalManagementserver.service.HouseService;
import com.xcode.HouseRentalManagementserver.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/house")
public class HouseController {

    @Autowired
    private HouseService houseService;

    @GetMapping("/list")
    public ResponseEntity<Map<String, Object>> getAllHouse() {
        List<House> results = houseService.getAllHouse();
        Map<String, Object> response = ResponseUtil.list("Successfully retrieved!", results);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @PostMapping("/create")
    public ResponseEntity<Map<String, Object>> createLeaveType(@RequestBody House house) {
        House result = houseService.saveHouse(house);
        Map<String, Object> response = ResponseUtil.retrieve("Successfully created!", result);
        return  ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}
