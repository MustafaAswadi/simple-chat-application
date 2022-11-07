package com.chat.demo.models;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ChatMessage {

    @Column(name = "message_id")
    private Long id;
    private String text;
    private LocalDate date;
    private LocalDate updatedAt;

    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getMessage() {
        return text;
    }
    public void setMessage(String message) {
        this.text = message;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public LocalDate getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }
}
