package com.chat.demo.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.chat.demo.services.ChatGroupsService;

import com.chat.demo.models.ChatGroups;


@Controller
public class GroupController {
    @Autowired
    private ChatGroupsService groupService;


    @PostMapping("/group/create")
    public String createGroup(@ModelAttribute ChatGroups entity) {
      
        groupService.save(entity);
        return "redirect:/group";
    }
    
    @RequestMapping(path = "groups/list", method=RequestMethod.GET)
    public String index(Model model)
    {
        model.addAttribute("groups", groupService.findAll());
        return "group/group-list";
    }

    @GetMapping("/group/edit/{id}")
    public String editCourse(@PathVariable Long id, Model model) {

        Optional<ChatGroups> group = groupService.findChatGroupsById(id);
        model.addAttribute("group", group);
        return "group/group-form";
    }

    @PostMapping("/group/delete/{id}")
    public String deleteCourse(@PathVariable Long id){

        groupService.deleteChatGroupsById(id);
        return "redirect:/group/list";
    }
}
