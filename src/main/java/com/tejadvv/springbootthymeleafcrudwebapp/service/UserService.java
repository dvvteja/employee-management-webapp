package com.tejadvv.springbootthymeleafcrudwebapp.service;

import com.tejadvv.springbootthymeleafcrudwebapp.dto.UserRegistrationDto;
import com.tejadvv.springbootthymeleafcrudwebapp.model.User;
import org.springframework.stereotype.Service;

public interface UserService {
    User save(UserRegistrationDto userRegistrationDto);
}
