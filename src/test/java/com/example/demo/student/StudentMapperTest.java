package com.example.demo.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class StudentMapperTest {
    private StudentMapper studentMapper;
    @BeforeEach
    void setUp() {
        studentMapper=new StudentMapper();
    }
  @Test
   public void shouldMapStudentDtoToStudent(){
  StudentDto studentDto=new StudentDto("oussama",
                                       "hassania",
                                       "oussama@gmai.com",
                                       1);
      Student student=studentMapper.tostudent(studentDto);
      assertEquals(studentDto.firstname(),student.getFirstname());
      assertEquals(studentDto.lastname(),student.getLastname());
      assertEquals(studentDto.email(),student.getEmail());
      assertNotNull(student.getSchool());
      assertEquals(studentDto.schoolId(),student.getSchool().getId());
   }
   @Test
   public void shouldMapStudentToStudentResponseDto(){
        Student student=new Student("mohamed",
                                    20,
                                    "mohamed@gmail.com",
                                   "el kandali");
        StudentResponseDto studentResponseDto=studentMapper.toresponseDto(student);
        assertEquals(student.getFirstname(),studentResponseDto.firstname());
        assertEquals(student.getLastname(),studentResponseDto.lastname());
        assertEquals(student.getEmail(),studentResponseDto.email());


   }


}