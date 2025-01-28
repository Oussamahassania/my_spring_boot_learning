package com.example.demo.school;

import org.springframework.stereotype.Service;

@Service
public class SchoolMapper {
    public School toschool(SchoolDto schoolDto) {
        return new School(schoolDto.name());
    }
    public SchoolDto toschooldto(School  school) {
        return new SchoolDto(school.getName());
    }
}
