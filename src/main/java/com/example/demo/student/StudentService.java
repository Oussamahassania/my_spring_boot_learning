package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {
    private final StudentReposotory studentReposotory;
    private final StudentMapper studentMapper;

    public StudentService(StudentReposotory studentReposotory, StudentMapper studentMapper) {
        this.studentReposotory = studentReposotory;
        this.studentMapper = studentMapper;
    }
    public StudentResponseDto savestudent(StudentDto dto) {
        var student=studentMapper.tostudent(dto);
        var savestudent=studentReposotory.save(student);
        return studentMapper.toresponseDto(savestudent);
    }
    public List<StudentResponseDto> findAllStudents() {
      return studentReposotory.findAll()
                              .stream().map(studentMapper::toresponseDto)
                              .collect(Collectors.toList());
    }
    public StudentResponseDto findStudentById(Integer id) {
        return studentReposotory.findById(id)
                                .map(studentMapper::toresponseDto)
                                .orElse(null);
    }
    public List<StudentResponseDto> findstudentbyname(String name) {
        return studentReposotory.findAllByFirstnameContaining(name)
                .stream().map(studentMapper::toresponseDto)
                .collect(Collectors.toList());
    }
    public void deleteStudentById(Integer id) {
        studentReposotory.deleteById(id);
    }
}
