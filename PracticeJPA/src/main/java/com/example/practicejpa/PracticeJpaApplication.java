package com.example.practicejpa;

import com.example.practicejpa.Student.Student;
import com.example.practicejpa.StudentRespo.StudentRespo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PracticeJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticeJpaApplication.class, args);
    }
//    @Bean
//    CommandLineRunner commandLineRunner (StudentRespo studentRespo){
//        return args -> {
//            Student maria = new Student("Clark kent","Clarkkent@gmail.com",18);
//            studentRespo.save(maria);
//        };
//    }
}
