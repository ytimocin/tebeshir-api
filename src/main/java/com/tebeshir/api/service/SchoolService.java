package com.tebeshir.api.service;

import com.tebeshir.api.entity.Student;
import com.tebeshir.api.repository.school.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yeko on 20/06/15.
 */
@Service
public class SchoolService {

    @Autowired
    private SchoolRepository schoolRepository;

}
