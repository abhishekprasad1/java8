package com.features;

import com.student.Student;
import com.student.StudentDataBase;


import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerAndPredicatePractice {
    public static void main(String[] args) {
        Predicate<Student> p1 = (student)->student.getGender().equalsIgnoreCase("male");
        Predicate<Student> p2 = (student)->student.getGradeLevel() > 3;
        Consumer<Student> bc = (student)->{
            if(p1.and(p2).test(student)){
                System.out.println("The Student is"+student);
            }
        };
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(bc);
        
    }



}
