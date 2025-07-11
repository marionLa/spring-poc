package com.kairos.poc_project.note.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MarkdownUtilsTest {


    @Test
    void parsesMarkdownToHtml() {
        String markdown = "# Hello, **world**!\nThis is *Markdown* test.";
        String expectedHtml = "<h1>Hello, <strong>world</strong>!</h1>\n<p>This is <em>Markdown</em> test.</p>\n";

        String actualHtml = MarkdownUtils.toHtml(markdown);

        assertEquals(expectedHtml, actualHtml);
    }

}