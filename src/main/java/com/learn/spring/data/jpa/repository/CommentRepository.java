package com.learn.spring.data.jpa.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.spring.data.jpa.model.onetomany.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
	Page<Comment> findByPostId(Long postId, Pageable pageable);
	
	Optional<Comment> findByIdAndPostId(Long id, Long postId);

}
