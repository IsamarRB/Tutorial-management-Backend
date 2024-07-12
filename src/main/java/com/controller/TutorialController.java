package com.controller;

import com.services.TutorialServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")
@Autowired

public class TutorialController {
    public TutorialServices tutorialServices;

    @PostMapping(path = "/Tutorial")
    public Tutorial createTutorial(@RequestBody Tutorial newTutorial) {
        return tutorialServices.createTutorial(newTutorial);
    }

    @DeleteMapping(path = "/Tutorial/{id}")
    public String deleteTutorial(@PathVariable int id) {
        return tutorialService.deleteTutorial(id);
    }

    @PutMapping(path = "/tutorials/{id}")
    public void updateTutorial(@RequestBody Tutorial tutorial, @PathVariable int id) {
        tutorialService.updateTutorial(tutorial, id);
    }

    @GetMapping(path = "/Tutorial")
    public ArrayList<Tutorial> getAllTutorial() {
        return tutorialService.getAllTutorial();
    }

    @GetMapping(path = "/welcome")
    public String sayHello() {
        return "Welcome to our tutorial";
    }

}
