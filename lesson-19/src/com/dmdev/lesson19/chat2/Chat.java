package com.dmdev.lesson19.chat2;

import java.sql.Array;
import java.util.List;

public class Chat {
    private String chatName;
    private List<ChatUser> chatUsers;

    public Chat(String chatName, List<ChatUser> chatUsers) {
        this.chatName = chatName;
        this.chatUsers = chatUsers;
    }

    public String getChatName() {
        return chatName;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName;
    }

    public List<ChatUser> getChatUsers() {
        return chatUsers;
    }

    public void setChatUsers(List<ChatUser> chatUsers) {
        this.chatUsers = chatUsers;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "chatName='" + chatName + '\'' +
                ", chatUsers=" + chatUsers +
                '}';
    }
}
