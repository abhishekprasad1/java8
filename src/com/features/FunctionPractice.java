package com.features;

import com.student.Student;
import com.student.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class FunctionPractice {

    public static void main(String[] args) {
        Function<List<Student>, Map<String, Double>> studentGpa = students -> {
            Map<String, Double> studentGpaMapping = new HashMap<>();
            students.forEach(student -> {
                studentGpaMapping.put(student.getName(), student.getGpa());
            });
            return studentGpaMapping;
        };

        BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> studentGpaWithCondition = (students, studentPredicate) -> {
            Map<String, Double> studentGpaMappingWithCondition = new HashMap<>();
            students.forEach(student -> {
                if (studentPredicate.test(student)) {
                    studentGpaMappingWithCondition.put(student.getName(), student.getGpa());
                }
            });
            return studentGpaMappingWithCondition;
        };
        System.out.println(studentGpa.apply(StudentDataBase.getAllStudents()));
        System.out.println(studentGpaWithCondition.apply(StudentDataBase.getAllStudents(), PredicatePractice.p2));

        IntFunction<String> intFunction = String::valueOf;
        IntFunction<String> intFunction1 =  String::valueOf;
        System.out.println(intFunction.apply(1));

        ToLongFunction<String> toLongFunction = value -> 0L;
        System.out.println("tolongfuntion : "+toLongFunction.applyAsLong("abhishek"));

    }


}



