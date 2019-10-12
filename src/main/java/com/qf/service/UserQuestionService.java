package com.qf.service;

import com.qf.domain.UserQuestion;

import java.util.List;

public interface UserQuestionService {
    String insertQuestion(UserQuestion userQuestion);

    List<UserQuestion> selectQuestion(Integer uid);

    UserQuestion selectUserQuestion(String description);

    List<UserQuestion> findByDid(Integer did);

    UserQuestion findByQid(Integer qid);
}
