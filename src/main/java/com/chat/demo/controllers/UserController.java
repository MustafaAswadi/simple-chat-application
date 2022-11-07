package com.chat.demo.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.chat.demo.models.ChatUsers;
import com.chat.demo.services.ChatUserService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    @Autowired
    private ChatUserService userService;

    @PostMapping("/user/create")
    public String createUser(@ModelAttribute ChatUsers entity) {
        userService.save(entity);
        return "hello";
    }
    
    @RequestMapping(path = "users/list", method=RequestMethod.GET)
    public String index(Model model)
    {
        model.addAttribute("user", userService.findAll());
        return "user/user-list";
    }

    @GetMapping("/user/edit/{id}")
    public String edituser(@PathVariable Long id, Model model) {

        Optional<ChatUsers> user = userService.findChatUsersById(id);
        model.addAttribute("user", user);
        return "user/user-form";
    }

    @PostMapping("/user/delete/{id}")
    public String deleteuser(@PathVariable Long id){

        userService.deleteChatUsersById(id);
        return "redirect:/user/list";
    } 
}
