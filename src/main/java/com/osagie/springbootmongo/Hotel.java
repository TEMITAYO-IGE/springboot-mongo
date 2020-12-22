package com.osagie.springbootmongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Document(collection = "Hotels")
public class Hotel {

    @Id
    private String id;
    private String name;
    private int roomPrice;
    private Address address;
    private List<Reviews> reviews;

    public Hotel() {
        this.reviews = new ArrayList<>();
    }

    public Hotel(String name, int roomPrice, Address address, List<Reviews> reviews) {
        this.roomPrice = roomPrice;
        this.name = name;
        this.address = address;
        this.reviews = reviews;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRoomPrice() {
        return roomPrice;
    }

    public Address getAddress() {
        return address;
    }

    public List<Reviews> getReviews() {
        return reviews;
    }
}
