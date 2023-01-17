package com.naab.bloodbank.contacter;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Contacter {
    @Id
    private String id;
    private String name ;
    private String email;
    private String mobile;
    private String created_at;


    public Contacter(String id,
                     String name,
                     String email,
                     String mobile,String created_at) {
        this.id = id;
        this.name = name;
        this.email=email;
        this.mobile = mobile;
        this.created_at = created_at;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}