package com.dmdev.lesson19.chat;

import java.util.Comparator;

public class SortByChatName implements Comparator<Chat> {
    @Override
    public int compare(Chat o1, Chat o2) {
        return o1.getChatName().compareTo(o2.getChatName());
    }
}
