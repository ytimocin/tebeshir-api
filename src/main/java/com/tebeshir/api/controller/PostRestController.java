package com.tebeshir.api.controller;

import com.tebeshir.api.entity.Post;
import com.tebeshir.api.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yeko on 20/06/15.
 */
@RestController
@RequestMapping("/tebeshir/post")
public class PostRestController {

    @Autowired
    private PostService postService;

    @RequestMapping(value = "/student/{tebeshirID}/post/{post}", method = RequestMethod.POST)
    public boolean register(@PathVariable String tebeshirID, @PathVariable String post) {
        return postService.newStudentPost(new Post(tebeshirID, post));
    }

}
