package com.example.student.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {

    @NotBlank(message = "Họ tên không được để trống")
    @Size(min = 5, max = 100, message = "Họ tên phải từ 5 đến 100 ký tự")
    private String fullName;

    @NotBlank(message = "Chuyên ngành không được để trống")
    private String major;

    @Min(value = 18, message = "Sinh viên phải từ 18 tuổi trở lên")
    private int age;

    @Min(value = 0, message = "Điểm GPA phải nằm trong khoảng 0 - 10")
    @Max(value = 10, message = "Điểm GPA phải nằm trong khoảng 0 - 10")
    private double gpa;

    @Pattern(regexp = "^SV\\d{4}$", message = "Mã sinh viên phải có dạng SVxxxx (VD: SV1234)")
    private String studentCode;

    @Valid
    private ParentDTO parent;
}
