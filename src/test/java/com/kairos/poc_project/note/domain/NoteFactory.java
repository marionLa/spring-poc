package com.kairos.poc_project.note.domain;

import java.util.Set;
import java.util.UUID;

public class NoteFactory {

    public static Note createDefault() {
        return Note.createNew("Default Title", "Default content", Set.of("general"));
    }

    public static Note createWithTitle(String title) {
        return Note.createNew(title, "Default content", Set.of("general"));
    }

    public static Note createWithTags(Set<String> tags) {
        return Note.createNew("Default Title", "Default content", tags);
    }

    public static Note createCustom(UUID id, String title, String content, Set<String> tags) {
        // Use constructor if you want to specify ID and timestamps (for advanced tests)
        return new Note(id, title, content, tags, null, null);
    }
}
