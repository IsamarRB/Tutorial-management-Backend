package com.services;

import com.Repository.ITutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TutorialServices {

    @Autowired
    private ITutorialRepository tutorialRepository;

    public Tutorial createTutorial(Tutorial newTutorial) {
        Tutorial save = tutorialRepository.save(newTutorial);
        return save;
    }

    public Tutorial createTutorial (Tutorial tutorial){
        return iTutorialRepository.save(tutorial);
    }
    public void updateTutorial(Tutorial tutorial, int id) {
        tutorial.setId(id);
        iTutorialRepository.save(tutorial);
    }


    public String deleteTutorial(int id) {
        try {
            if (iTutorialRepository.existsById(id)) {
                iTutorialRepository.deleteById(id);
                return "You have deleted the tutorial with ID: " + id;
            } else {
                return "The tutorial with ID: " + id + " does not exist.";
            }
        } catch (Exception e) {
            return "An error occurred while trying to delete the tutorial with ID: " + id;
        }
    }
}
