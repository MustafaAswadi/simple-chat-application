package com.chat.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chat.demo.models.ChatMessage;
import com.chat.demo.repositories.ChatMessageRepository;

@Service
public class ChatMessageServiceImp implements ChatMessageService {

    @Autowired
    private ChatMessageRepository chatMessageRepository;
    
    @Override
    public void save(ChatMessage message) {
        chatMessageRepository.save(message);
    }

    @Override
    public Object findAll() {
        return  chatMessageRepository.findAll();
    }

    @Override
    public Optional<ChatMessage> findChatMessageById(Long id) {
       
        return chatMessageRepository.findById(id);
    }

    @Override
    public void deleteChatMessageById(Long id) {
        chatMessageRepository.deleteById(id);
    }

}
    

