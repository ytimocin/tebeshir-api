package com.tebeshir.api.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by yeko on 20/06/15.
 */
@Document(collection = "post")
public class Post {

    @Id
    private String postID;
    private String tebeshirID;
    private String post;

    public Post(String tebeshirID, String post) {
        this.tebeshirID = tebeshirID;
        this.post = post;
    }

    public String getPostID() {
        return postID;
    }

    public void setPostID(String postID) {
        this.postID = postID;
    }

    public String getTebeshirID() {
        return tebeshirID;
    }

    public void setTebeshirID(String tebeshirID) {
        this.tebeshirID = tebeshirID;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
