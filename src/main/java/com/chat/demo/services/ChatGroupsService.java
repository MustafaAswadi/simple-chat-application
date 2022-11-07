package com.chat.demo.services;

import java.util.Optional;

import com.chat.demo.models.ChatGroups;

public interface ChatGroupsService {
    void save(ChatGroups group);

    Object findAll();

    Optional<ChatGroups> findChatGroupsById(Long id);

    void deleteChatGroupsById(Long id);
}
