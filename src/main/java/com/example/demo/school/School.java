package com.example.demo.school;

import com.example.demo.student.Student;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class School {
    @Id
    @GeneratedValue
    private Integer id;
    @OneToMany(
            mappedBy = "school"
    )
    private List<Student> students;

    public School(String name) {
        this.name = name;
    }

    public School() {
    }

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
