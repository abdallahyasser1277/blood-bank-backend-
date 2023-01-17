package com.naab.bloodbank.recipient;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Recipient {
    @Id
    private String id;
    private String name ;
    private int age;
    private String gender;
    private String mobile;
    private String to_date;
    private String city;
    private String bloodGroup;

    public Recipient(String id,
                     String name,
                     int age,
                     String gender,
                     String mobile,
                     String to_date,
                     String city,
                     String bloodGroup) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.mobile = mobile;
        this.to_date = to_date;
        this.city = city;
        this.bloodGroup = bloodGroup;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getMobile() {
        return mobile;
    }

    public String getTo_date() {
        return to_date;
    }

    public String getCity() {
        return city;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setTo_date(String to_date) {
        this.to_date = to_date;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
}