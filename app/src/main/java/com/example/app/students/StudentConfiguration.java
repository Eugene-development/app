package com.example.app.students;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfiguration {

    @Bean
    public CommandLineRunner commandLineRunner (StudentRepository studentRepository){
        return args -> {
            studentRepository.saveAll(List.of(
                    new Student("Alex","alex@ddfd.com" ,LocalDate.of(2000, Month.JANUARY, 1)),
                    new Student("Bob","Bob@kjnjsbw.com", LocalDate.of(2005, Month.MARCH, 12))
            ));
        };

    }
}
