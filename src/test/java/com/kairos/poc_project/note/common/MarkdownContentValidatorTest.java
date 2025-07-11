package com.kairos.poc_project.note.common;

import com.kairos.poc_project.note.domain.Note;
import com.kairos.poc_project.note.domain.NoteFactory;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MarkdownContentValidatorTest {
    private static Validator validator;

    @BeforeAll
    static void setupValidatorInstance() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    void whenContentIsValidMarkdown_thenNoValidationErrors() {
        Note note = NoteFactory.createDefault();
        note.setContent("## This is **markdown** content\n- list item");

        Set<ConstraintViolation<Note>> violations = validator.validate(note);

        assertTrue(violations.isEmpty());
    }

}