package com.akshai.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents(){

        return List.of(
                new Student(
                        "Hello",
                        "World",
                        LocalDate.now(),
                        "akshaikanna01@gmail.com",
                        21
                ),

                new Student(
                        "Hellllll",
                        "World",
                        LocalDate.now(),
                        "akshaikanna01@gmail.com",
                        22
                )
        );
    }


}
