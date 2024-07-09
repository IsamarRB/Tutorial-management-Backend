package com.services;

import Repository.ITutorialRepository;
import com.model.Tutorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

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


}
