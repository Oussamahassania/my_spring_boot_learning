package com.example.demo.student;

import jakarta.validation.constraints.NotEmpty;
import org.apache.logging.log4j.message.Message;

public record StudentDto(
        @NotEmpty(message = "firstname should not be empty")
        String firstname,
        @NotEmpty
        String lastname,
        String email,
        Integer schoolId
) {
}
