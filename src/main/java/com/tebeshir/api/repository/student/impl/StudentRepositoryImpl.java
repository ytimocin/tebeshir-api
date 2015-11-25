package com.tebeshir.api.repository.student.impl;

/**
 * Created by yeko on 19/06/15.
 */
public abstract class StudentRepositoryImpl /*implements StudentRepository*/ {

    /*
    MongoDbFactory mongoDbFactory;
    MongoTemplate mongoTemplate;
    MappingMongoConverter mappingMongoConverter;

    @Autowired
    public StudentRepositoryImpl(MongoDbFactory mongoDbFactory, MappingMongoConverter mappingMongoConverter) {
        this.mongoDbFactory = mongoDbFactory;
        this.mappingMongoConverter = mappingMongoConverter;
        mongoTemplate = new MongoTemplate(mongoDbFactory, mappingMongoConverter);
    }

    @Override
    public RegisterResult register(Student student) {
        RegisterResult registerResult = new RegisterResult();
        mongoTemplate.save(student);
        return registerResult;
    }
    */
}
