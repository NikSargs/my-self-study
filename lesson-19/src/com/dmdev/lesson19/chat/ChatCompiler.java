package com.dmdev.lesson19.chat;

import com.dmdev.lesson19.Student.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ChatCompiler {
    public static void main(String[] args) {
        List chatList = new ArrayList(Arrays.asList(
                new Chat("inform", 1000),
                new Chat("home", 1000),
                new Chat("work", 200),
                new Chat("movies", 20),
                new Chat("school", 3000)
        ));
//        List<Chat> chatList = Arrays.asList(
//                new Chat("inform", 1000),
//                new Chat("home", 100),
//                new Chat("work", 200),
//                new Chat("movies", 2000),
//                new Chat("school", 3000)
//        );

        Iterator<Chat> chat = chatList.iterator();
        while (chat.hasNext()) {
            Chat o = chat.next();
            if(o.getNumberOfUsers() < 1000){
                chat.remove();
            }
        }
        System.out.println(chatList);

    }
}
