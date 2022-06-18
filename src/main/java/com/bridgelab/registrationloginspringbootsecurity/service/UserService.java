package com.bridgelab.registrationloginspringbootsecurity.service;

import com.bridgelab.registrationloginspringbootsecurity.model.User;
import com.bridgelab.registrationloginspringbootsecurity.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
