package com.kairos.poc_project.note.domain;

import java.util.Set;
import java.util.UUID;

public class NoteFactory {

    public static Note createDefault() {
        return new Note("Default Title", "Default content", Set.of("general"));
    }

    public static Note createWithTitle(String title) {
        return new Note(title, "Default content", Set.of("general"));
    }

    public static Note createWithTags(Set<String> tags) {
        return new Note("Default Title", "Default content", tags);
    }

    public static Note createCustom(UUID id, String title, String content, Set<String> tags) {
        return new Note(id, title, content, tags, null, null);
    }
}
