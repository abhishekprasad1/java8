package com.features;

import com.student.Student;
import com.student.StudentConstructor;

import java.util.Arrays;
import java.util.function.*;

public class ConstructorReferencePractice {



    public static void main(String[] args) {
      Function<String,Student> studentObject = Student::new;
        BiFunction<String, Integer, Student> studentObject1 = Student::new;

        System.out.println("the object is : "+studentObject1.apply("abhishek",5));
        StudentConstructor sc = Student::new;
        Student student = sc.getStudent("abhishek",5, 3.8,"male", Arrays.asList("Cricket", "Reading", "Cycling"));
        System.out.println("the student is"+student);



    }
}
