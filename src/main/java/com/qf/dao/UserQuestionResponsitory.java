package com.qf.dao;

import com.qf.domain.User;
import com.qf.domain.UserQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserQuestionResponsitory extends JpaRepository<UserQuestion,Integer> {

}
