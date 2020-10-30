package com.xcode.HouseRentalManagementserver.service;

import com.xcode.HouseRentalManagementserver.model.House;
import com.xcode.HouseRentalManagementserver.repository.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HouseServiceImpl implements HouseService {

    @Autowired
    private HouseRepository houseRepository;

    @Override
    public List<House> getAllHouse() {
        return houseRepository.findAll();
    }

    @Override
    public Optional<House> findByHouseId(long houseId) {
        return houseRepository.findById(houseId);
    }

    @Override
    public House saveHouse(House house) {
        return houseRepository.save(house);
    }

    @Override
    public void deleteHouse(long houseId) {
        houseRepository.deleteById(houseId);
    }
}
