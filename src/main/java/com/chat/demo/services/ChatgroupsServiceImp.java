package com.chat.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chat.demo.models.ChatGroups;
import com.chat.demo.repositories.ChatGroupsRepository;

@Service
public class ChatgroupsServiceImp implements ChatGroupsService {

    @Autowired
    private ChatGroupsRepository chatGroupsRepository;

    @Override
    public void save(ChatGroups group) {
        chatGroupsRepository.save(group);
    }

    @Override
    public Object findAll() {
        return chatGroupsRepository.findAll();
    }

    @Override
    public Optional<ChatGroups> findChatGroupsById(Long id) {
        return chatGroupsRepository.findById(id);
    }

    @Override
    public void deleteChatGroupsById(Long id) {
        chatGroupsRepository.deleteById(id);
        
    }

    
}
