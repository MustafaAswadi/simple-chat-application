package com.chat.demo.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.chat.demo.models.ChatMessage;
import com.chat.demo.services.ChatMessageService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MessageController {
    
    @Autowired
    private ChatMessageService messageService;

    @PostMapping("/message/create")
    public String createmessage(@ModelAttribute ChatMessage entity) {
      
        messageService.save(entity);
        return "redirect:/message";
    }
    
    @RequestMapping(path = "messages/list", method=RequestMethod.GET)
    public String index(Model model)
    {
        model.addAttribute("message", messageService.findAll());
        return "message/message-list";
    }

    @GetMapping("/message/edit/{id}")
    public String editMessage(@PathVariable Long id, Model model) {

        Optional<ChatMessage> message = messageService.findChatMessageById(id);
        model.addAttribute("message", message);
        return "message/message-form";
    }

    @PostMapping("/message/delete/{id}")
    public String deleteMessage(@PathVariable Long id){

        messageService.deleteChatMessageById(id);
        return "redirect:/message/list";
    }
}
