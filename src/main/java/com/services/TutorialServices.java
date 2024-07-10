package com.services;

import com.Repository.ITutorialRepository;
import com.model.Tutorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service

public class TutorialServices {
    @Autowired
    ITutorialRepository iTutorialRepository;

    public ArrayList<Tutorial> getAllTutorial(){
        return (ArrayList<Tutorial>) iTutorialRepository.findAll();
    }
    public Tutorial createTutorial (Tutorial tutorial){
        return iTutorialRepository.save(tutorial);
    }
    public void updateTutorial(Tutorial tutorial, int id) {
        tutorial.setId(id);
        iTutorialRepository.save(tutorial);
    }
}
