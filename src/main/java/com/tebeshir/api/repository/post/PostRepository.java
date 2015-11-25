package com.tebeshir.api.repository.post;

import com.tebeshir.api.entity.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by yeko on 20/06/15.
 */
public interface PostRepository extends MongoRepository<Post, String> {

}
