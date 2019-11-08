package com.learn.spring.data.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learn.spring.data.jpa.model.audit.Answer;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long>{

	List<Answer> findByQuestionId(Long questionId);
}
