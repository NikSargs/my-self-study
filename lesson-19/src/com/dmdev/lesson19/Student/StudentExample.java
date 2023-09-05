package com.dmdev.lesson19.Student;

import com.dmdev.lesson19.map.SortExample;
import com.dmdev.lesson19.person.Person;

import java.util.*;

public class StudentExample {
    public static void main(String[] args) {

        List<Student> studentlist = Arrays.asList(
                new Student("ivan", "ivanov", 18, 3.7),
                new Student("petr", "petrov", 17, 4.0),
                new Student("sveta", "svetova", 20, 3.4)
        );
        Iterator<Student> iterator = studentlist.iterator();
        double maxScore = 0;
        Student bestStudent = null;
        for (Student student : studentlist) {
            if(student.getScore() > maxScore){
                bestStudent = student;
                maxScore = student.getScore();
            }
        }
        System.out.println("best student - " + bestStudent);

        studentlist.sort(new NameCorporator());
        System.out.println(studentlist);
        studentlist.sort(new AgeCorporator());
        System.out.println(studentlist);

    }
    public static class NameCorporator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getFullName().compareTo(o2.getFullName());
        }
    }
    public static class AgeCorporator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }

}
