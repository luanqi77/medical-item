package com.qf.service.impl;

import com.qf.dao.UserQuestionResponsitory;
import com.qf.domain.UserQuestion;
import com.qf.service.UserQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserQuestionServiceImpl implements UserQuestionService {
    @Autowired
    private UserQuestionResponsitory userQuestionResponsitory;

    @Override
    public String insertQuestion(UserQuestion userQuestion) {
        userQuestion.setCreateTime(new Date());
        UserQuestion save = userQuestionResponsitory.save(userQuestion);
        if (save!=null){
            return "ok";
        }
        return "no";
    }

    @Override
    public List<UserQuestion> selectQuestion() {
        return  userQuestionResponsitory.findAll();
    }
}
