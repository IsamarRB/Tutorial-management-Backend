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
    private TutorialServices tutorialServices;

    @PostMapping(path = "/Tutorial")
    public Tutorial createTutorial(@RequestBody Tutorial newTutorial) {
        return tutorialServices.createTutorial(newTutorial);
    }
}
