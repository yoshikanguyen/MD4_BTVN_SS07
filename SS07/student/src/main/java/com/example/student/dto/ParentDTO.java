package com.example.student.dto;

import com.example.student.validation.ViettelPhone;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParentDTO {

    @NotBlank(message = "Tên phụ huynh không được để trống")
    @Pattern(regexp = "^[A-Z].*", message = "Tên phụ huynh phải viết hoa chữ cái đầu")
    private String name;

    @ViettelPhone(message = "SĐT phụ huynh là đầu số Viettel")
    private String phoneNumber;
}
