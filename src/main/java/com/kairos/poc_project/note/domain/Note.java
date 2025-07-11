package com.kairos.poc_project.note.domain;

import com.kairos.poc_project.note.common.MarkdownFormatted;

import java.time.Instant;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

public class Note {
    private UUID id;
    private String title;
    @MarkdownFormatted
    private String content;
    private Set<String> tags;
    private Instant createdAt;
    private Instant updatedAt;

    public Note() {
        super();
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Note(UUID id, String title, String content, Set<String> tags, Instant createdAt, Instant updatedAt) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.tags = tags;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Note(String title, String content, Set<String> tags) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.content = content;
        this.tags = tags;
        this.createdAt = Instant.now();
        this.updatedAt = Instant.now();
    }

    public void updateContent(String newTitle, String newContent, Set<String> newTags) {
        this.title = newTitle;
        this.content = newContent;
        this.tags = newTags;
        this.updatedAt = Instant.now();
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Set<String> getTags() {
        return tags;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Note note)) return false;
        return id.equals(note.id);
    }

    public int hashCode() {
        return Objects.hash(id);
    }
}
