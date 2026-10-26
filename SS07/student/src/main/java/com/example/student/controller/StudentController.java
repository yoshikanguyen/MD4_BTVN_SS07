package com.example.student.controller;

import com.example.student.dto.StudentDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @PostMapping
    public ResponseEntity<String> createStudent(@Valid @RequestBody StudentDTO studentDTO) {
        return ResponseEntity.ok("Thêm sinh viên thành công!");
    }
}
