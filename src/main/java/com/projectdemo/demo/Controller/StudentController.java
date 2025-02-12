package com.projectdemo.demo.Controller;

import java.util.List;

import com.projectdemo.demo.Repository.StudentRepo;
import com.projectdemo.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    StudentRepo repo; //Creating a repo variable from the JPA Repository

    @GetMapping(value= "/students")
    public List<Student> getAllStudents() {
        List<Student> students = repo.findAll();
        return students; //getting the details of all the students
    }

    @PostMapping(value= "/students/add")
    public void createStudent(@RequestBody Student student) {
        repo.save(student); //adding the details of new student
    }

    @PutMapping(value= "/student/update/{id}")
    public void updateStudent(@PathVariable int id) {
        Student student = repo.findById(id).get(); //fetching details of student to be updated
        repo.save(student); //updating the details
    }

    @DeleteMapping(value="/student/delete/{id}")
    public void deleteStudent(@PathVariable int id) {
        Student student = repo.findById(id).get(); //fetching details of student to be deleted
        repo.delete(student); //deleting the details
    }
}
