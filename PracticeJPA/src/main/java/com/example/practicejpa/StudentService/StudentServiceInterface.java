package com.example.practicejpa.StudentService;

import com.example.practicejpa.Student.Student;

import java.util.List;

public interface StudentServiceInterface {
    //save
    public Student saveStudent(Student student);
    //delete
    public String deleteStudent(Long id);
    //read
    public List<Student> GetStudent();
    //read by id
    public List<Student> GetStudentById(Long id);
    //update
    public Student UpdateStudent(Long id,Student student);
}
