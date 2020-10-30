package com.xcode.HouseRentalManagementserver.service;

import com.xcode.HouseRentalManagementserver.model.House;

import java.util.List;
import java.util.Optional;

public interface HouseService {

    List<House> getAllHouse();

    Optional<House> findByHouseId(long houseId);

    House saveHouse(House house);

    void deleteHouse(long houseId);

}
