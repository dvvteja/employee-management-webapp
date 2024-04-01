package com.tejadvv.springbootthymeleafcrudwebapp.service;

import com.tejadvv.springbootthymeleafcrudwebapp.dto.UserRegistrationDto;
import com.tejadvv.springbootthymeleafcrudwebapp.model.Role;
import com.tejadvv.springbootthymeleafcrudwebapp.model.User;
import com.tejadvv.springbootthymeleafcrudwebapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User save(UserRegistrationDto userRegistrationDto) {
        User user=new User(userRegistrationDto.getFirstName(),userRegistrationDto.getLastName(),
                userRegistrationDto.getEmail(),userRegistrationDto.getPassword(),
                Arrays.asList(new Role("ROLE_USER")));
        return userRepository.save(user);
    }
}
