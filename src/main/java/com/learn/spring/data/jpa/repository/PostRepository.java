package com.learn.spring.data.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learn.spring.data.jpa.model.onetomany.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
