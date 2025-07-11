package com.kairos.poc_project.note.common;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = MarkdownContentValidator.class)
@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface MarkdownFormatted {
    String message() default "Content is not valid Markdown";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}