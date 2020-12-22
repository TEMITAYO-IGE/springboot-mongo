package com.osagie.springbootmongo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "Reviews")
public class Reviews {
    private String userName;
    private int rating;
    private boolean approved;

    public Reviews(String userName, int rating, boolean approved) {
        this.userName = userName;
        this.rating = rating;
        this.approved = approved;
    }

    public Reviews() {
    }

    public String getUserName() {
        return userName;
    }

    public int getRating() {
        return rating;
    }

    public boolean isApproved() {
        return approved;
    }
}
