package com.tebeshir.api.repository.student;

import com.tebeshir.api.entity.Student;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by yeko on 11/06/15.
 */
public interface StudentRepository extends CrudRepository<Student, String> {

    Student findByFacebookID(String facebookID);

}
