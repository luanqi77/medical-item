package com.qf.service.impl;

import com.qf.dao.UserQuestionResponsitory;
import com.qf.domain.UserQuestion;
import com.qf.service.UserQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class UserQuestionServiceImpl implements UserQuestionService {
    @Autowired
    private UserQuestionResponsitory userQuestionResponsitory;

    @Override
    public String insertQuestion(UserQuestion userQuestion) {
        if (userQuestion.getUid()!=null) {
            if (!userQuestion.getDescription().isEmpty() && !userQuestion.getAge().equals("")) {
                userQuestion.setCreateTime(new Date());
                System.out.println(userQuestion);
                UserQuestion save = userQuestionResponsitory.save(userQuestion);
                return "ok";
            }else {
                return "noMessage";
            }
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

    @Override
    public List<UserQuestion> findByDid(Integer did) {
        return userQuestionResponsitory.findByDid(did);
    }

    @Override
    public UserQuestion findByQid(Integer qid) {
        return userQuestionResponsitory.findByQid(qid);
    }
}
