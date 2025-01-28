package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentReposotory extends JpaRepository<Student, Integer> {
    List<Student>findAllByFirstnameContaining(String firstname);
}
