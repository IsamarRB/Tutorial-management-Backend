package com.services;

import com.Repository.ITutorialRepository;
import com.model.Tutorial;
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
}
