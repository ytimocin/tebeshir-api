package com.tebeshir.api.repository.school;

import com.tebeshir.api.entity.School;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by yeko on 11/06/15.
 */
public interface SchoolRepository extends MongoRepository<School, String> {
}
