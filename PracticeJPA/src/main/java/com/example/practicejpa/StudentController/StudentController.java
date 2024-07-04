package com.example.practicejpa.StudentController;

import com.example.practicejpa.Student.Student;
import com.example.practicejpa.StudentRespo.StudentRespo;
import com.example.practicejpa.StudentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    //service
    private StudentService studentService;

    //create
    @PostMapping("/PostDetails")
    public Student postdetails(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }
    //delete by id
    @DeleteMapping("/DeleteDetails/{id}")
    public String deleteStudent(@PathVariable Long id) {
        return studentService.deleteStudent(id);
    }
    //read all
    @GetMapping("/GetDetails")
    public List<Student> kuninStudent(){
        return studentService.GetStudent();
    }
    //read by id
    @GetMapping("/GetDetails/{id}")
    public List<Student> GetById(@PathVariable Long id){
        return studentService.GetStudentById(id);
    }
    //update by id
    @PutMapping("/UpdateDetails/{id}")
    public Student Updatestudent(@PathVariable Long id, @RequestBody Student student){
        return studentService.UpdateStudent(id, student);
    }
}
