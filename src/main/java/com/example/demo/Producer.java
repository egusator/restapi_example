package com.example.demo;

public class Producer {
    private long id ;
    private String instagram;

    public void setId(long id) {
        this.id = id;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    private String email;
    private int rating ;

    public Producer(long id, String instagram, String email, int rating ) {
        this.id = id;
        this.instagram = instagram;
        this.email = email;
        this.rating = rating ;
    }


    public long getId() {
        return id;
    }

    public String getInstagram() {
        return instagram;
    }

    public String getEmail() {
        return email;
    }

    public int getRating() {
        return rating;
    }

}
