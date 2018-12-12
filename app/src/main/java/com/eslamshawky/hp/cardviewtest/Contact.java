package com.eslamshawky.hp.cardviewtest;

public class Contact {

    private int image_id;
    private String name,email,mobile;

    public Contact(int image_id, String name, String email, String mobile) {
        this.image_id = image_id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
    }

    public int getImage_id() {
        return image_id;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }

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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
