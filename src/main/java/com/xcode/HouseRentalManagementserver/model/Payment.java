package com.xcode.HouseRentalManagementserver.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_payments")
public class Payment {
    private long payment_id;
    private long tenant_id;
    private int payment_house;
    private int payment_year;
    private int payment_month;
    private int payment_expected_amt;
    private String payment_paid_amt;
    private String payment_balance;
    private int payment_date;
    private String comments;

    public long getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(long payment_id) {
        this.payment_id = payment_id;
    }

    public long getTenant_id() {
        return tenant_id;
    }

    public void setTenant_id(long tenant_id) {
        this.tenant_id = tenant_id;
    }

    public int getPayment_house() {
        return payment_house;
    }

    public void setPayment_house(int payment_house) {
        this.payment_house = payment_house;
    }

    public int getPayment_year() {
        return payment_year;
    }

    public void setPayment_year(int payment_year) {
        this.payment_year = payment_year;
    }

    public int getPayment_month() {
        return payment_month;
    }

    public void setPayment_month(int payment_month) {
        this.payment_month = payment_month;
    }

    public int getPayment_expected_amt() {
        return payment_expected_amt;
    }

    public void setPayment_expected_amt(int payment_expected_amt) {
        this.payment_expected_amt = payment_expected_amt;
    }

    public String getPayment_paid_amt() {
        return payment_paid_amt;
    }

    public void setPayment_paid_amt(String payment_paid_amt) {
        this.payment_paid_amt = payment_paid_amt;
    }

    public String getPayment_balance() {
        return payment_balance;
    }

    public void setPayment_balance(String payment_balance) {
        this.payment_balance = payment_balance;
    }

    public int getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(int payment_date) {
        this.payment_date = payment_date;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "payment{" +
                "payment_id=" + payment_id +
                ", tenant_id=" + tenant_id +
                ", payment_house=" + payment_house +
                ", payment_year=" + payment_year +
                ", payment_month=" + payment_month +
                ", payment_expected_amt=" + payment_expected_amt +
                ", payment_paid_amt='" + payment_paid_amt + '\'' +
                ", payment_balance='" + payment_balance + '\'' +
                ", payment_date=" + payment_date +
                ", comments='" + comments + '\'' +
                '}';
    }
}
