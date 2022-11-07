package com.chat.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chat.demo.models.ChatUsers;

public interface ChatUsersRepository extends JpaRepository<ChatUsers, Long> {
    
}
    

