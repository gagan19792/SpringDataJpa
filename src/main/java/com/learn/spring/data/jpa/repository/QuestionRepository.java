package com.learn.spring.data.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learn.spring.data.jpa.model.audit.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long>{

}
