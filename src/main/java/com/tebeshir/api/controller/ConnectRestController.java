package com.tebeshir.api.controller;

import com.tebeshir.api.service.ConnectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yeko on 12/05/15.
 */

@RestController
@RequestMapping("/tebeshir/connect")
public class ConnectRestController {

    @Autowired
    private ConnectService connectService;

    @RequestMapping(value = "/student/{tebeshirID}/school/{schoolID}", method = RequestMethod.POST)
    public boolean register(@PathVariable String tebeshirID, @PathVariable String schoolID) {
        return connectService.connectStudentToSchool(tebeshirID, schoolID);
    }
}