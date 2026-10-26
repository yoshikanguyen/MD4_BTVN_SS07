package com.example.student.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.List;

public class ViettelPhoneValidator implements ConstraintValidator<ViettelPhone, String> {

    private static final List<String> VIETTEL_PREFIXES = List.of(
            "086", "096", "097", "098", "032", "033", "034", "035", "036", "037", "038", "039"
    );

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        // Kiểm tra độ dài - bắt đầu bằng số 0
        if (value.length() != 10 || !value.startsWith("0")) {
            return false;
        }
        String prefix = value.substring(0, 3);
        return VIETTEL_PREFIXES.contains(prefix);
    }
}
