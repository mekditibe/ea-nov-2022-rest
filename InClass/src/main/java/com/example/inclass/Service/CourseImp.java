package com.example.inclass.Service;

import com.example.inclass.Entity.Course;
import com.example.inclass.Repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseImp implements CourseInt {

    @Autowired
    private CourseRepo courseRepo;
    @Override
    public void addCourse(Course course) {
        courseRepo.addCourse(course);
    }

    public void editCourse(int courseId, Course course) {
//        Course obj =courseRepo.getCourseById(courseId);
        courseRepo.deleteCourse(courseId);
        courseRepo.addCourse(course);
    }
    @Override
    public Course getCourse(int courseId) {
        return courseRepo.getCourseById(courseId);
    }
    @Override
    public void deleteCourse(int courseId){
        courseRepo.deleteCourse(courseId);
    }
    @Override
    public List<Course> getCourses(){
        return courseRepo.getCourses();
    }

}
