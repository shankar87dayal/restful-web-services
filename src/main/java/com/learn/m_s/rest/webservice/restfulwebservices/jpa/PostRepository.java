package com.learn.m_s.rest.webservice.restfulwebservices.jpa;

import com.learn.m_s.rest.webservice.restfulwebservices.user.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
