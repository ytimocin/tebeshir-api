package com.tebeshir.api.service;

import com.tebeshir.api.entity.Connect;
import com.tebeshir.api.entity.Student;
import com.tebeshir.api.repository.connect.ConnectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by yeko on 20/06/15.
 */
@Service
public class ConnectService {

    @Autowired
    private ConnectRepository connectRepository;

    public boolean connectStudentToSchool(String tebeshirID, String schoolID) {
        Connect connect = connectRepository.findByTebeshirID(tebeshirID);
        if(connect == null) {
            LinkedList<String> schoolIDs = new LinkedList<>();
            schoolIDs.add(schoolID);
            connect = new Connect();
            connect.setTebeshirID(tebeshirID);
            connect.setSchoolIDs(schoolIDs);
        } else {
            if (connect.getSchoolIDs().contains(schoolID) == false) {
                connect.getSchoolIDs().add(schoolID);
            }
        }
        connectRepository.save(connect);
        return true;
    }

}
