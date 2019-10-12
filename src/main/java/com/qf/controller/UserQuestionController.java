package com.qf.controller;

import com.qf.domain.Docter;
import com.qf.domain.DoctorAnswer;
import com.qf.domain.User;
import com.qf.domain.UserQuestion;
import com.qf.service.DoctorAnswerService;
import com.qf.service.DoctorService;
import com.qf.service.UserQuestionService;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserQuestionController {
    @Autowired
    private UserQuestionService userQuestionService;
    @Autowired
    private UserService userService;
    @Autowired
    private DoctorService doctorService;
    @Autowired
    private DoctorAnswerService doctorAnswerService;
    @RequestMapping(value = "/insertQuestion",method = RequestMethod.POST)
    public String insertQuestion(@RequestBody UserQuestion userQuestion){
        return  userQuestionService.insertQuestion(userQuestion);
    }


    @RequestMapping(value = "/selectQuestion",method = RequestMethod.POST)
    public List<UserQuestion> selectQuestion(@RequestBody User user){
        if (user.getUsername()!=null){
            Integer uid = userService.selectUid(user.getUsername());
            System.out.println(userQuestionService.selectQuestion(uid));

            return userQuestionService.selectQuestion(uid);
        }
            return null;
    }

    @RequestMapping(value = "/selectUserQuestion",method = RequestMethod.POST)
    public UserQuestion selectUserQuestion(@RequestBody UserQuestion userQuestion){
        return userQuestionService.selectUserQuestion(userQuestion.getDescription());
    }
    @RequestMapping(value = "/selectDocter",method = RequestMethod.POST)
    public Docter selectDocter(@RequestBody UserQuestion userQuestion){
        UserQuestion userQuestion1 = userQuestionService.selectUserQuestion(userQuestion.getDescription());
        return doctorService.selectDocter(userQuestion1.getDid());
    }

    @RequestMapping(value = "/selectAnswer",method = RequestMethod.POST)
    public DoctorAnswer selectAnswer(@RequestBody UserQuestion userQuestion){
        UserQuestion userQuestion1 = userQuestionService.selectUserQuestion(userQuestion.getDescription());
        return doctorAnswerService.selectAnswer(userQuestion1.getQid());
    }

}
