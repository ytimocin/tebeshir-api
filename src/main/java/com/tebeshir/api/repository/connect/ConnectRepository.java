package com.tebeshir.api.repository.connect;

import com.tebeshir.api.entity.Connect;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by yeko on 20/06/15.
 */
public interface ConnectRepository extends MongoRepository<Connect, String> {

    Connect findByTebeshirID(String tebeshirID);

}
