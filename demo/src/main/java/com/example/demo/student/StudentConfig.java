package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;


@Configuration
public class StudentConfig {

    @SuppressWarnings("null")
    @Bean
 CommandLineRunner commandLineRunner (StudentRepository repository){
    return arg ->{
        Student xander = new Student(
          1L,
          "Xander",
          "kalisa@gmail.com",
          LocalDate.of(2001,9, 15)
   
        );
        Student manyembua = new Student(
          2L,
          "manyembua",
          "manyembua@gmail.com",
          LocalDate.of(2008, 3, 13)
       
        );
        // repository.saveAll(List.of(manyembua, xander));
        repository.saveAll(List.of(xander, manyembua));
        
    };
}
}

