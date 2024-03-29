package com.example.spring_mvc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckEmailValidator.class)
public @interface CheckEmail {
    public String value() default "gmail.com";
    public String message() default "email must ands with gmail.com";

    public Class<?>[] groups() default {};
    public Class<? extends Payload>[] payload() default {};
}
