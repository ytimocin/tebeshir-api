package com.tebeshir.api.service;

import com.tebeshir.api.entity.Post;
import com.tebeshir.api.repository.post.PostRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yeko on 20/06/15.
 */
@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public boolean newStudentPost(Post post) {
        // buraya degisik bir
        // logic yapariz
        postRepository.save(post);
        return true;
    }

}
