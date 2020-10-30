package com.xcode.HouseRentalManagementserver.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "tbl_tenant")
public class Tenant {
    private long tenant_id;
    private String tenant_fullname;
    private String tenant_gender;
    private String tenant_national_id;
    private String tenant_phone_no;
    private String tenant_email;
    private Date tenant_registration_date;
    private long house_id;
    private String tenant_status;
    private Date tenant_exit_date;
    private Date tenant_agreement_doc;

    public long getTenant_id() {
        return tenant_id;
    }

    public void setTenant_id(long tenant_id) {
        this.tenant_id = tenant_id;
    }

    public String getTenant_fullname() {
        return tenant_fullname;
    }

    public void setTenant_fullname(String tenant_fullname) {
        this.tenant_fullname = tenant_fullname;
    }

    public String getTenant_gender() {
        return tenant_gender;
    }

    public void setTenant_gender(String tenant_gender) {
        this.tenant_gender = tenant_gender;
    }

    public String getTenant_national_id() {
        return tenant_national_id;
    }

    public void setTenant_national_id(String tenant_national_id) {
        this.tenant_national_id = tenant_national_id;
    }

    public String getTenant_phone_no() {
        return tenant_phone_no;
    }

    public void setTenant_phone_no(String tenant_phone_no) {
        this.tenant_phone_no = tenant_phone_no;
    }

    public String getTenant_email() {
        return tenant_email;
    }

    public void setTenant_email(String tenant_email) {
        this.tenant_email = tenant_email;
    }

    public Date getTenant_registration_date() {
        return tenant_registration_date;
    }

    public void setTenant_registration_date(Date tenant_registration_date) {
        this.tenant_registration_date = tenant_registration_date;
    }

    public long getHouse_id() {
        return house_id;
    }

    public void setHouse_id(long house_id) {
        this.house_id = house_id;
    }

    public String getTenant_status() {
        return tenant_status;
    }

    public void setTenant_status(String tenant_status) {
        this.tenant_status = tenant_status;
    }

    public Date getTenant_exit_date() {
        return tenant_exit_date;
    }

    public void setTenant_exit_date(Date tenant_exit_date) {
        this.tenant_exit_date = tenant_exit_date;
    }

    public Date getTenant_agreement_doc() {
        return tenant_agreement_doc;
    }

    public void setTenant_agreement_doc(Date tenant_agreement_doc) {
        this.tenant_agreement_doc = tenant_agreement_doc;
    }

    @Override
    public String toString() {
        return "tenant{" +
                "tenant_id=" + tenant_id +
                ", tenant_fullname='" + tenant_fullname + '\'' +
                ", tenant_gender='" + tenant_gender + '\'' +
                ", tenant_national_id='" + tenant_national_id + '\'' +
                ", tenant_phone_no='" + tenant_phone_no + '\'' +
                ", tenant_email='" + tenant_email + '\'' +
                ", tenant_registration_date=" + tenant_registration_date +
                ", house_id=" + house_id +
                ", tenant_status='" + tenant_status + '\'' +
                ", tenant_exit_date=" + tenant_exit_date +
                ", tenant_agreement_doc=" + tenant_agreement_doc +
                '}';
    }
}
