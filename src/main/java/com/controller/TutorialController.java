package com.controller;
import com.model.Tutorial;
import com.services.TutorialServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
}
