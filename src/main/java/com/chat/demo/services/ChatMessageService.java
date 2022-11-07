package com.chat.demo.services;

import java.util.Optional;

import com.chat.demo.models.ChatMessage;

public interface ChatMessageService {
    void save(ChatMessage message);

    Object findAll();

    Optional<ChatMessage> findChatMessageById(Long id);

    void deleteChatMessageById(Long id);
}
