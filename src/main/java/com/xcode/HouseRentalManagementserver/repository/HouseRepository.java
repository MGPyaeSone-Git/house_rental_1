package com.xcode.HouseRentalManagementserver.repository;

import com.xcode.HouseRentalManagementserver.model.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseRepository extends JpaRepository<House, Long> {
}
