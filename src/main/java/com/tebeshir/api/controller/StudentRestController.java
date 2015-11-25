package com.tebeshir.api.controller;

import com.tebeshir.api.entity.Student;
import com.tebeshir.api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by yeko on 12/05/15.
 */

@RestController
@RequestMapping("/tebeshir/student")
public class StudentRestController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Student register(@RequestBody Student student) {
        Student registerResult = studentService.register(student);
        return registerResult;
    }

    /*
    @RequestMapping(method = RequestMethod.GET)
    public List<Student> getAll() {
        return repo.findAll();
    }

    @RequestMapping(method = RequestMethod.GET)
    public Student get(@RequestParam("facebookID") String facebookID) {
        return repo.findByFacebookID(facebookID);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Student create(@RequestBody Student student) {
        return repo.save(student);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "{id}")
    public void delete(@PathVariable String id) {
        repo.delete(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "{id}")
    public Student update(@PathVariable String id, @RequestBody Student tebeshirUser) {
        Student update = repo.findOne(id);
        update.setFacebookID(tebeshirUser.getFacebookID());
        update.setEmail(tebeshirUser.getEmail());
        update.setName(tebeshirUser.getName());
        update.setPictureURL(tebeshirUser.getPictureURL());
        return repo.save(update);
    }
    */
}