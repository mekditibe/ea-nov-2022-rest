package com.example.inclass.Service;

import com.example.inclass.Entity.Course;
import com.example.inclass.Entity.Student;

import java.util.List;

public interface StudentInt {
    List<Student> getStudents();
    List<Student> getStudentsByMajor(String major);
    void addStudent(Student student);
    void editStudent(int studentId, Student student);
    void deleteStudent(int studentId);
    List<Course> getCoursesByStudentId(int studentId);
    Student getStudent(int studentId);


}
