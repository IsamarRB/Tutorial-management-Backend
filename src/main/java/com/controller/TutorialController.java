package com.controller;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Tutorial;
import com.services.TutorialServices;



@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")

public class TutorialController {
    @Autowired
    TutorialServices tutorialService;

    @DeleteMapping(path = "/Tutorial/{id}")
    public String deleteTutorial(@PathVariable int id) {
        return tutorialService.deleteTutorial(id);
}

    @GetMapping(path = "/Tutorial")
    public ArrayList<Tutorial> getAllTutorial() {
        return tutorialService.getAllTutorial();
    }
    
    @GetMapping(path = "/wellcome")
    public String sayHello() {
        return "Wellcome to our tutorial";
    }
    
}