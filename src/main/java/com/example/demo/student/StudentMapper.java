package com.example.demo.student;

import com.example.demo.school.School;
import org.springframework.stereotype.Service;

@Service
public class StudentMapper {
    public Student tostudent(StudentDto dto) {
        var student = new Student();
        student.setFirstname(dto.firstname());
        student.setLastname(dto.lastname());
        student.setEmail(dto.email());
        var school = new School();
        school.setId(dto.schoolId());
        student.setSchool(school);
        return student;
    }
    public StudentResponseDto toresponseDto(Student student) {
        return new StudentResponseDto(student.getFirstname(),
                                       student.getLastname(),
                                      student.getEmail());
    }
}
