package com.citi.lecture.entity;

import java.util.Date;

public class Client {

    public String name;

    public String email;

    public String company;

    public String last_update_by;

    public Date last_update_timestamp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLast_update_by() {
        return last_update_by;
    }

    public void setLast_update_by(String last_update_by) {
        this.last_update_by = last_update_by;
    }

    public Date getLast_update_timestamp() {
        return last_update_timestamp;
    }

    public void setLast_update_timestamp(Date last_update_timestamp) {
        this.last_update_timestamp = last_update_timestamp;
    }

    @Override
    public String toString() {
        return "name:" + name + ", email:" + email + ", company:" + company + ", last_update_by: " + last_update_by + ", last_update_timestamp: " + last_update_timestamp;
    }
}
