package com.kairos.poc_project.note.domain;

import com.kairos.poc_project.utils.JsonTestUtils;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


class NoteTest {

    @Test
    void mustReturnNoteDefaultTitle(){
        Note note = NoteFactory.createDefault();
        assertEquals("Default Title", note.getTitle());
    }

    @Test
    void mustUpdateNote(){
        Note note = NoteFactory.createDefault();
        note.updateContent("New Title", "New content", Set.of("general"));
        assertEquals("New Title", note.getTitle());
    }


    @Test
    void loadNoteFromJson() throws Exception {
        Note note = JsonTestUtils.readJsonFromResource("/note.json", Note.class);

        assertNotNull(note);
        assertEquals("Sample Note", note.getTitle());
    }

}
