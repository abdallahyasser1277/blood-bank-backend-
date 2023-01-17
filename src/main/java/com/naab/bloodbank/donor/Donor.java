package com.naab.bloodbank.donor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Donor {
    @Id
    private String id;
    private String name ;
    private int age;
    private String gender;
    private String mobile;
    private String numDay;
    private String city;
    private String bloodGroup;

    public Donor(String id,
                 String name,
                 int age,
                 String gender,
                 String mobile,
                 String numDay,
                 String city,
                 String bloodGroup) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.mobile = mobile;
        this.numDay = numDay;
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

    public String getNumDay() {
        return numDay;
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

    public void setNumDay(String numDay) {
        this.numDay = numDay;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
}