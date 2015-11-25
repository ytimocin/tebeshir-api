package com.tebeshir.api.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.LinkedList;

/**
 * Created by yeko on 20/06/15.
 */
@Document(collection = "connect")
public class Connect {

    @Id
    private String connectID;
    private String tebeshirID;
    private LinkedList<String> schoolIDs;

    public String getConnectID() {
        return connectID;
    }

    public void setConnectID(String connectID) {
        this.connectID = connectID;
    }

    public String getTebeshirID() {
        return tebeshirID;
    }

    public void setTebeshirID(String tebeshirID) {
        this.tebeshirID = tebeshirID;
    }

    public LinkedList<String> getSchoolIDs() {
        return schoolIDs;
    }

    public void setSchoolIDs(LinkedList<String> schoolID) {
        this.schoolIDs = schoolID;
    }
}
