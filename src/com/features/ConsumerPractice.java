package com.features;

import com.student.Student;
import com.student.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjDoubleConsumer;

public class ConsumerPractice {
    public static void main(String[] args) {

        Consumer<Student> c1 = (s) -> {
            System.out.println(s);
        };

        Consumer<Student> c2 = (s1) -> {
            //if(s1.getGender().equalsIgnoreCase("male")){
            System.out.println(s1.getName());
            //}
        };
        List<Student> data = StudentDataBase.getAllStudents();
        data.forEach(s1 -> {
            if (s1.getGender().equalsIgnoreCase("male")) {
                c2.andThen(c1).accept(s1);
            }
        });

        IntConsumer consumer = value -> System.out.println("this is the int value : "+value);
        consumer.accept(10);


    }




}
