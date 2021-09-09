package com.features;

import com.student.Student;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

import com.student.Student;
import com.student.StudentDataBase;

public class PredicatePractice {
   static Predicate<Student> p1 = (student)->student.getGender().equalsIgnoreCase("female");
   static Predicate<Student> p2 = (student)->student.getGpa() > 3.9;

    public static void main(String[] args) {
      List<Student> data = StudentDataBase.getAllStudents();
        data.forEach(student -> {
            if(p1.and(p2).negate().test(student)){
                System.out.println("Student-->"+student);
            }
        });

    }
}
