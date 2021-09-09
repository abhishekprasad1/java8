package com.features;

import com.student.Student;
import com.student.StudentDataBase;

import java.sql.SQLOutput;
import java.util.List;
import java.util.function.Supplier;

public class SupplierPractice {
    public static void main(String[] args) {
        Supplier<List<Student>> supplyData = StudentDataBase::getAllStudents;

        supplyData.get().forEach(System.out::println);
        System.err.println("hello");
        System.out.println("hello");

    }
}
