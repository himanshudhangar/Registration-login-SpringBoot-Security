package com.bridgelab.registrationloginspringbootsecurity.repository;

import com.bridgelab.registrationloginspringbootsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<org.springframework.security.core.userdetails.User, Long>{
    User findByEmail(String email);
}