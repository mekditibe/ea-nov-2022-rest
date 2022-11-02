package com.example.inclass.Controller;

import com.example.inclass.Entity.Course;
import com.example.inclass.Service.CourseImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/course")
@RestController
public class CourseController {

    @Autowired
    private CourseImp courseImp;

    @GetMapping
    public List<Course> getCourses(){
        return courseImp.getCourses();
    }

    @GetMapping("/{id}")
    public Course getCourse(@PathVariable Integer id){
        return courseImp.getCourse(id);
    }
    @PutMapping("/{id}")
    public void editCourse(@PathVariable Integer id, @RequestBody Course course){
        courseImp.editCourse(id, course);
    }

    @PostMapping
    public void saveCourse(@RequestBody Course course){
        courseImp.addCourse(course);
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable Integer id){
        courseImp.deleteCourse(id);
    }

}
