package com.tejadvv.springbootthymeleafcrudwebapp.service;

import com.tejadvv.springbootthymeleafcrudwebapp.dto.UserRegistrationDto;
import com.tejadvv.springbootthymeleafcrudwebapp.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto userRegistrationDto);
}
