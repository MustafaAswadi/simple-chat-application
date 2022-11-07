package com.chat.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chat.demo.models.ChatUsers;
import com.chat.demo.repositories.ChatUsersRepository;

@Service
public class ChatUserServiceImp implements ChatUserService {

    @Autowired
    private ChatUsersRepository chatUserRepository;
    
    @Override
    public void save(ChatUsers user) {
        chatUserRepository.save(user);
    }

    @Override
    public Object findAll() {
        return chatUserRepository.findAll();
    }

    @Override
    public Optional<ChatUsers> findChatUsersById(Long id) {
        
        return chatUserRepository.findById(id);
    }

    @Override
    public void deleteChatUsersById(Long id) {
        chatUserRepository.deleteById(id);
        
    }
}
