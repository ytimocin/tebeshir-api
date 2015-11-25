package com.tebeshir.api.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by yeko on 11/06/15.
 */
@Document(collection = "student")
public class Student {

    @Id
    private String tebeshirID;
    private String facebookID;
    private String email;
    private String name;
    private String pictureURL;

    public String getTebeshirID() {
        return tebeshirID;
    }

    public void setTebeshirID(String tebeshirID) {
        this.tebeshirID = tebeshirID;
    }

    public String getFacebookID() {
        return facebookID;
    }

    public void setFacebookID(String facebookID) {
        this.facebookID = facebookID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPictureURL() {
        return pictureURL;
    }

    public void setPictureURL(String pictureURL) {
        this.pictureURL = pictureURL;
    }
}
