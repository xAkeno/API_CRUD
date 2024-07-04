package com.example.practicejpa.StudentService;

import com.example.practicejpa.Student.Student;
import com.example.practicejpa.StudentRespo.StudentRespo;
import org.hibernate.sql.results.graph.collection.internal.CollectionDomainResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class StudentService implements StudentServiceInterface {

    @Autowired
    private StudentRespo studentRespo;

    @Override
    public String deleteStudent(Long id){
        studentRespo.deleteById(id);
        return "delete Sucessfull";
    }
    @Override
    public Student saveStudent(Student student) {
        return studentRespo.save(student);
    }

    @Override
    public List<Student> GetStudent() {
        return studentRespo.findAll();
    }

    @Override
    public List<Student> GetStudentById(Long id) {
        List<Student> student = studentRespo.findAllById(Collections.singletonList(id));
        if(student.isEmpty()){
            throw new NoSuchElementException("No Student Id Found!");
        }
        return student;
    }
    @Override
    public Student UpdateStudent(Long id,Student newStudent){
        Optional<Student> present = Optional.of(studentRespo.findById(id).get());
        if(present.isPresent()) {

            Student already = present.get();
            already.setName(newStudent.getName());
            already.setAge(newStudent.getAge());
            already.setEmail(newStudent.getEmail());

            return studentRespo.save(already);
        }
        else{
            throw new NoSuchElementException("No Student Id Found!");
        }
    }
}
