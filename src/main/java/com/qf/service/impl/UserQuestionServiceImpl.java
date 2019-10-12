package com.qf.service.impl;

import com.qf.dao.UserQuestionResponsitory;
import com.qf.domain.UserQuestion;
import com.qf.service.UserQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class UserQuestionServiceImpl implements UserQuestionService {
    @Autowired
    private UserQuestionResponsitory userQuestionResponsitory;

    @Override
    public String insertQuestion(UserQuestion userQuestion) {
        if(!userQuestion.getDescription().isEmpty()&&!userQuestion.getAge().equals("")){
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date date = new Date();
            String format1 = format.format(date);

            try {
                Date date1=format.parse(format1);
                userQuestion.setCreateTime(date1);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            UserQuestion save = userQuestionResponsitory.save(userQuestion);
            return "ok";
        }
        return "no";
    }

    @Override
    public List<UserQuestion> selectQuestion(Integer uid) {
         return userQuestionResponsitory.findUserQuestionByUid(uid);

    }

    @Override
    public UserQuestion selectUserQuestion(String description) {
        return userQuestionResponsitory.findUserQuestionByDescription(description);
    }


}
