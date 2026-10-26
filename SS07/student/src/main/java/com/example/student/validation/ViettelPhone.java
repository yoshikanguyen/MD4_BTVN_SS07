package com.example.student.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ViettelPhoneValidator.class)
public @interface ViettelPhone {
    String message() default "SĐT phụ huynh là đầu số Viettel";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
