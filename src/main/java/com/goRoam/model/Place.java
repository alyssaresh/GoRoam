package com.goRoam.model;

import jakarta.persistence.*;

@Entity
@Table(name = "places")
public class Place {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String name;

    @Column
    private String address;

    @Column
    private Float latitude;

    @Column
    private Float longitude;

    @Column
    private String interest;

    @Column
    private String sourceApi;

    @Column
    private Float rating;

    public Place(){}

    public Place(String name, String address, Float latitude, Float longitude, String interest,
            String sourceApi, Float rating) {
        this.name = name;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.interest = interest;
        this.sourceApi = sourceApi;
        this.rating = rating;
    }

    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Float getLatitude() {
        return latitude;
    }
    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }
    public Float getLongitude() {
        return longitude;
    }
    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }
    public String getInterest() {
        return interest;
    }
    public void setInterest(String interest) {
        this.interest = interest;
    }
    public String getSourceApi() {
        return sourceApi;
    }
    public void setSourceApi(String sourceApi) {
        this.sourceApi = sourceApi;
    }
    public Float getRating() {
        return rating;
    }
    public void setRating(Float rating) {
        this.rating = rating;
    }
}
