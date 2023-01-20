package com.learn.m_s.rest.webservice.restfulwebservices.jpa;

import com.learn.m_s.rest.webservice.restfulwebservices.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
