package com.qf.controller;

import com.qf.domain.UserQuestion;
import com.qf.service.UserQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserQuestionController {
    @Autowired
    private UserQuestionService userQuestionService;

    @RequestMapping(value = "/insertQuestion",method = RequestMethod.POST)
    public String insertQuestion(@RequestBody UserQuestion userQuestion){
        return  userQuestionService.insertQuestion(userQuestion);
    }

    @RequestMapping(value = "/selectQuestion",method = RequestMethod.POST)
    public List<UserQuestion> selectQuestion(){
        return userQuestionService.selectQuestion();
    }
}
