package com.example.inclass.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class Student {
    private  int id;
    private  String firstName;
    private  String lastName;
    private  String email;
    private  String major;
    private  Double gpa;
    private List<Course> coursesTaken;

}
