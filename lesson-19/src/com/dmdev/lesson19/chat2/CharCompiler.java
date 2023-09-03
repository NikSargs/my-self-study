package com.dmdev.lesson19.chat2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CharCompiler {
    public static void main(String[] args) {
        ChatUser firstChatUsers[] = {new ChatUser(1, "Nikita", 18), new ChatUser(2, "Ilya", 12), new ChatUser(3, "Galina", 24)};
        ChatUser secondChatUsers[] = {new ChatUser(1, "Andrey", 34), new ChatUser(2, "Denis", 10), new ChatUser(3, "Lena", 12)};
        ChatUser thirdChatUsers[] = {new ChatUser(1, "Sabina", 15), new ChatUser(2, "Leon", 25), new ChatUser(3, "Alina", 20)};
        List chatList = new ArrayList(Arrays.asList(
                new Chat("inform", new ArrayList(Arrays.asList(firstChatUsers))),
                new Chat("work", new ArrayList(Arrays.asList(secondChatUsers))),
                new Chat("school", new ArrayList(Arrays.asList(thirdChatUsers)))
        ));

        List adultList = new ArrayList<>();



        System.out.println(adultList);
    }
}
