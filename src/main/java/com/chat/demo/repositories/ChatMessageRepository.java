package com.chat.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chat.demo.models.ChatMessage;

@Repository
public interface ChatMessageRepository extends JpaRepository<ChatMessage, Long> {
    
}
