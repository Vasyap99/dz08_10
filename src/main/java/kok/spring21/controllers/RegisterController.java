package kok.spring21.controllers;


import kok.spring21.RegisterService;
import kok.spring21.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.validation.BindingResult;

import java.util.List;
import java.util.Optional;

import kok.spring21.models.User;


@Controller
public class RegisterController {

    @Autowired
    RegisterService rs;

    @Autowired
    UserRepository ur;
    @GetMapping("/register")
    public String register1(@ModelAttribute("u") User u){
        return "register";
    }
    @PostMapping("/register")
    public String register2(@ModelAttribute("u") /*@Valid*/ User u, BindingResult br){
        rs.saveUser(new User(u.getName(),u.getPass()));
        return "redirect:login";
    }
}
