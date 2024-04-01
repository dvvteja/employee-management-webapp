package com.tejadvv.springbootthymeleafcrudwebapp.controller;

import com.tejadvv.springbootthymeleafcrudwebapp.dto.UserRegistrationDto;
import com.tejadvv.springbootthymeleafcrudwebapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
    @Autowired
    private UserService userService;

    @GetMapping
    public String showRegistrationForm(Model model){
        model.addAttribute("user",new UserRegistrationDto());
        return "registration";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto userRegistrationDto){
        userService.save(userRegistrationDto);
        return "redirect:/registration?success";
    }
}
