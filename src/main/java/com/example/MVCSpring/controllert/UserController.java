package com.example.MVCSpring.controllert;

import com.example.MVCSpring.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/form")
    public String form(Model model){
        model.addAttribute("user", new User());
        return "userForm";
    }

    @GetMapping("/added")
    public String added(){
        return "userAdded";
    }

    @PostMapping("/save")
    public String userSave(@ModelAttribute("user")User user){
        System.out.println(user.getName());
        System.out.println(user.getEmail());
        System.out.println(user.getNumber());
        System.out.println(user.getPassword());
        return "redirect:/user/added";
    }
}

