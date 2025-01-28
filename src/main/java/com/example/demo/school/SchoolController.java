package com.example.demo.school;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class SchoolController {
    private final SchoolService schoolService;

    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }
    @PostMapping("/school")
    public SchoolDto create(
          @RequestBody SchoolDto schoolDto
    ) {
        return schoolService.create(schoolDto);
    }
    @GetMapping("/schools")
    public List<SchoolDto> findAll() {
        return schoolService.findAll();

    }
}
