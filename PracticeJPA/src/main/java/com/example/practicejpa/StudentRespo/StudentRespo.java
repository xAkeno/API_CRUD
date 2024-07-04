package com.example.practicejpa.StudentRespo;

import com.example.practicejpa.Student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRespo extends JpaRepository<Student,Long> {
}
