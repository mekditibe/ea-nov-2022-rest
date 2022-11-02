package com.example.inclass.Repository;

import com.example.inclass.Entity.Course;
import com.example.inclass.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class StudentRepo {

    static List<Student> students = new ArrayList<>();
    static List<Course> courses= new ArrayList<>();

    static {
        Course c2= new Course(2,"FPP","C7K35");
        Course c3= new Course(3,"WAP","C3DF3");
        Course c1= new Course(1,"MWA","C9DF3");
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);
        Student s1= new Student(1,"Mekdes","Teffera","mekdi@miu.edu","Software",4.0,courses);
        students.add(s1);
    }

    public List<Student> getStudents(){
        return students;
    }

    public void addStudent(Student s){
        students.add(s);
        courses.addAll(s.getCoursesTaken());
    }

    public Student getStudentById(int studentId){

        return students.get(studentId);
    }

    public void deleteStudent(int studentId){
        students.remove(studentId);
    }

    public List<Student> getStudentsByMajor(String major){
        return students.stream().filter(s->s.getMajor().equals(major)).collect(Collectors.toList());
    }

    public List<Course> getCoursesByStudentId(int studentId){
        return students.get(studentId).getCoursesTaken();
    }
}
