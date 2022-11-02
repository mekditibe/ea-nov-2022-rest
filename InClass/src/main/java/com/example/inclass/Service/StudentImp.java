package com.example.inclass.Service;

import com.example.inclass.Entity.Course;
import com.example.inclass.Entity.Student;
import com.example.inclass.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentImp implements StudentInt {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public List<Student> getStudents() {
        return studentRepo.getStudents();
    }
    @Override
    public Student getStudent(int studentId) {
        return studentRepo.getStudentById(studentId);
    }
    @Override
    public List<Student> getStudentsByMajor(String major) {
        return studentRepo.getStudentsByMajor(major);
    }

    @Override
    public void addStudent(Student student) {
        studentRepo.addStudent(student);
    }

    @Override
    public void editStudent(int studentId, Student student) {
//        Student obj =studentRepo.getStudentById(studentId);
        studentRepo.deleteStudent(studentId);
        studentRepo.addStudent(student);
    }

    @Override
    public void deleteStudent(int studentID) {
        studentRepo.deleteStudent(studentID);
    }

    @Override
    public List<Course> getCoursesByStudentId(int studentId) {
        return studentRepo.getCoursesByStudentId(studentId);
    }



}
