package com.dmdev.lesson16;

import java.util.Arrays;

public class EnumRunner {
    public static void main(String[] args) {
        ProcessorType processorType = ProcessorType.BIT32;
        System.out.println(processorType);
        System.out.println(processorType.name());
        System.out.println(Arrays.toString(ProcessorType.values()));
        System.out.println(processorType.getName());
        System.out.println(processorType.getDescription());
    }
}
