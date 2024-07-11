package com.controller;
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

    @PutMapping(path = "/tutorials/{id}")
    public void updateTutorial(@RequestBody Tutorial tutorial, @PathVariable int id) {
        tutorialService.updateTutorial(tutorial, id);
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