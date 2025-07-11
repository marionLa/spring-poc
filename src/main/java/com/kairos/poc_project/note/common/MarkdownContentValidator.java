package com.kairos.poc_project.note.common;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.commonmark.node.Node;
import org.commonmark.parser.Parser;

public class MarkdownContentValidator implements ConstraintValidator<MarkdownFormatted, String> {

    private Parser parser;

    @Override
    public void initialize(MarkdownFormatted constraintAnnotation) {
        parser = Parser.builder().build();
    }

    @Override
    public boolean isValid(String content, ConstraintValidatorContext context) {
        if (content == null || content.isBlank()) {
            return false;
        }
        try {
            Node document = parser.parse(content);
            return document.getFirstChild() != null;
        } catch (Exception e) {
            return false;
        }
    }
}
