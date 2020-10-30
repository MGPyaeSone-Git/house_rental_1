package com.xcode.HouseRentalManagementserver.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_invoice")
public class Invoice {
    private long invoice_id;
    private long tenant_id;
    private String invoice_phone;
    private int invoice_house;
    private String invoice_year;
    private String invoice_month;
    private String invoice_particulars;
    private String invoice_total;
    private String invoice_comments;
    private String invoice_status;

    public long getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(long invoice_id) {
        this.invoice_id = invoice_id;
    }

    public long getTenant_id() {
        return tenant_id;
    }

    public void setTenant_id(long tenant_id) {
        this.tenant_id = tenant_id;
    }

    public String getInvoice_phone() {
        return invoice_phone;
    }

    public void setInvoice_phone(String invoice_phone) {
        this.invoice_phone = invoice_phone;
    }

    public int getInvoice_house() {
        return invoice_house;
    }

    public void setInvoice_house(int invoice_house) {
        this.invoice_house = invoice_house;
    }

    public String getInvoice_year() {
        return invoice_year;
    }

    public void setInvoice_year(String invoice_year) {
        this.invoice_year = invoice_year;
    }

    public String getInvoice_month() {
        return invoice_month;
    }

    public void setInvoice_month(String invoice_month) {
        this.invoice_month = invoice_month;
    }

    public String getInvoice_particulars() {
        return invoice_particulars;
    }

    public void setInvoice_particulars(String invoice_particulars) {
        this.invoice_particulars = invoice_particulars;
    }

    public String getInvoice_total() {
        return invoice_total;
    }

    public void setInvoice_total(String invoice_total) {
        this.invoice_total = invoice_total;
    }

    public String getInvoice_comments() {
        return invoice_comments;
    }

    public void setInvoice_comments(String invoice_comments) {
        this.invoice_comments = invoice_comments;
    }

    public String getInvoice_status() {
        return invoice_status;
    }

    public void setInvoice_status(String invoice_status) {
        this.invoice_status = invoice_status;
    }

    @Override
    public String toString() {
        return "invoices{" +
                "invoice_id=" + invoice_id +
                ", tenant_id=" + tenant_id +
                ", invoice_phone='" + invoice_phone + '\'' +
                ", invoice_house=" + invoice_house +
                ", invoice_year='" + invoice_year + '\'' +
                ", invoice_month='" + invoice_month + '\'' +
                ", invoice_particulars='" + invoice_particulars + '\'' +
                ", invoice_total='" + invoice_total + '\'' +
                ", invoice_comments='" + invoice_comments + '\'' +
                ", invoice_status='" + invoice_status + '\'' +
                '}';
    }
}
