package com.chat.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chat.demo.models.ChatGroups;

@Repository
public interface ChatGroupsRepository extends JpaRepository<ChatGroups, Long> {
    
}
