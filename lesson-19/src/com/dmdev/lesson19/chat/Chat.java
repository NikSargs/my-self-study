package com.dmdev.lesson19.chat;

public class Chat{
    private String chatName;
    private int numberOfUsers;

    public Chat(String chatName, int numberOfUsers) {
        this.chatName = chatName;
        this.numberOfUsers = numberOfUsers;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "chatName='" + chatName + '\'' +
                ", numberOfUsers=" + numberOfUsers +
                '}';
    }

    public String getChatName() {
        return chatName;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public void setNumberOfUsers(int numberOfUsers) {
        this.numberOfUsers = numberOfUsers;
    }


}
