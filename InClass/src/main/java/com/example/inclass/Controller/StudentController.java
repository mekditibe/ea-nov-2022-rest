package com.example.inclass.Controller;

import com.example.inclass.Entity.Course;
import com.example.inclass.Entity.Student;
import com.example.inclass.Service.StudentImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/student")
@RestController
public class StudentController {

    @Autowired
    private StudentImp studentImp;

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Integer id){
        return studentImp.getStudent(id);
    }
    @GetMapping
    public List<Student> getStudents(){
        return studentImp.getStudents();
    }
    @GetMapping("/{id}/course")
    public List<Course> getCoursesByStudentId(@PathVariable Integer id){
        return studentImp.getCoursesByStudentId(id);
    }

    @GetMapping("/filterByMajor/{major}")
    public List<Student> getStudentsByMajor(@PathVariable String major){
        return studentImp.getStudentsByMajor(major);
    }

    @PostMapping
    public void saveStudent(@RequestBody Student student){
        studentImp.addStudent(student);
    }

    @PutMapping("/{id}")
    public void editStudent(@PathVariable Integer id,@RequestBody Student student){
        studentImp.editStudent(id, student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Integer id){
        studentImp.deleteStudent(id);
    }

}
