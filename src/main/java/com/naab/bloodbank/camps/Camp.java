package com.naab.bloodbank.camps;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Camp {
    @Id
    private String id;
    private String title;
    private String city;
    private String map;

    public Camp(String id,
                String title,
                String city,
                String map) {
        this.id = id;
        this.title = title;
        this.city = city;
        this.map = map;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCity() {
        return city;
    }

    public String getMap() {
        return map;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setMap(String map) {
        this.map = map;
    }
}