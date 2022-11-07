package com.chat.demo.services;

import java.util.Optional;

import com.chat.demo.models.ChatUsers;

public interface ChatUserService {
    void save(ChatUsers user);

    Object findAll();

    Optional<ChatUsers> findChatUsersById(Long id);

    void deleteChatUsersById(Long id);
}
