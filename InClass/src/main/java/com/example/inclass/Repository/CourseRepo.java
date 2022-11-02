package com.example.inclass.Repository;

import com.example.inclass.Entity.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class CourseRepo {
  static List<Course> courses= new ArrayList<>();
  static {
      Course c0= new Course(0,"MPP","C24FG");
      courses.add(c0);

  }


  public List<Course> getCourses(){
      return courses;
    }

    public void addCourse(Course c){
      courses.add(c);
    }

    public Course getCourseById(int courseId){
      return courses.get(courseId);
    }

    public void deleteCourse(int courseId){
        courses.remove(courseId);
    }

    public void editCourse(int courseId,Course course){
      Course c=courses.get(courseId);
      c.setCode(course.getCode());
      c.setName(course.getName());
    }

//    Optional<Course> course= courses.stream().filter(c->c.getId() == courseId).findAny();
//        if(course.isPresent()){
//        return course.get();
//    }
}
