package com.xcode.HouseRentalManagementserver.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_house")
public class House {
    private long house_id;
    private String house_number;
    private String house_features;
    private double house_rent;
    private String house_status;

    public long getHouse_id() {
        return house_id;
    }

    public void setHouse_id(long house_id) {
        this.house_id = house_id;
    }

    public String getHouse_number() {
        return house_number;
    }

    public void setHouse_number(String house_number) {
        this.house_number = house_number;
    }

    public String getHouse_features() {
        return house_features;
    }

    public void setHouse_features(String house_features) {
        this.house_features = house_features;
    }

    public double getHouse_rent() {
        return house_rent;
    }

    public void setHouse_rent(double house_rent) {
        this.house_rent = house_rent;
    }

    public String getHouse_status() {
        return house_status;
    }

    public void setHouse_status(String house_status) {
        this.house_status = house_status;
    }

    @Override
    public String toString() {
        return "house{" +
                "house_id=" + house_id +
                ", house_number='" + house_number + '\'' +
                ", house_features='" + house_features + '\'' +
                ", house_rent=" + house_rent +
                ", house_status='" + house_status + '\'' +
                '}';
    }
}
