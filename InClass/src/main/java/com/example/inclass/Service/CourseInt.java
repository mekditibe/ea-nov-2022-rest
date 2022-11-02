package com.example.inclass.Service;

import com.example.inclass.Entity.Course;

import java.util.List;

public interface CourseInt {

    List<Course> getCourses();
    void addCourse(Course course);
    void deleteCourse(int courseId);
    Course getCourse(int courseId);



}
