package com.qf.dao;

import com.qf.domain.User;
import com.qf.domain.UserQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserQuestionResponsitory extends JpaRepository<UserQuestion,Integer> {
        UserQuestion findUserQuestionByDescription(String description);

        List<UserQuestion> findUserQuestionByUid(Integer uid);

}
