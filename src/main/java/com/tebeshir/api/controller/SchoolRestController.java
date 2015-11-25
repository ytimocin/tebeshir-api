package com.tebeshir.api.controller;

import com.tebeshir.api.entity.School;
import com.tebeshir.api.repository.school.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by yeko on 12/05/15.
 */

@RestController
@RequestMapping("/tebeshir/school")
public class SchoolRestController {

    @Autowired
    private SchoolRepository repo;

    @RequestMapping(method = RequestMethod.GET)
    public List<School> getAll() {
        return repo.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public School create(@RequestBody School school) {
        return repo.save(school);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "{id}")
    public void delete(@PathVariable String id) {
        repo.delete(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "{id}")
    public School update(@PathVariable String id, @RequestBody School school) {
        School update = repo.findOne(id);
        update.setSchoolID(school.getSchoolID());
        update.setSchoolName(school.getSchoolName());
        update.setCoordinates(school.getCoordinates());
        return repo.save(update);
    }

}