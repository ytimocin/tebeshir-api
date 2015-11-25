package com.tebeshir.api.service;

import com.tebeshir.api.entity.Student;
import com.tebeshir.api.repository.student.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yeko on 20/06/15.
 */
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student register(Student studentToBeRegistered) {

        Student student = studentRepository.findByFacebookID(studentToBeRegistered.getFacebookID());
        if (student == null){
            student = new Student();
            student.setFacebookID(studentToBeRegistered.getFacebookID());
            student.setEmail(studentToBeRegistered.getEmail());
            student.setName(studentToBeRegistered.getName());
            student.setPictureURL(studentToBeRegistered.getPictureURL());
            studentRepository.save(student);
        } else {
            student = studentToBeRegistered;
        }
        return student;

    }

    public boolean connectToSchool(String schoolID) {
        return true;
    }

}
