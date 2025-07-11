package com.kairos.poc_project.note.domain;

import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;


public class MarkdownUtils {
    private static final Parser parser = Parser.builder().build();
    private static final HtmlRenderer renderer = HtmlRenderer.builder().build();

    private MarkdownUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static String toHtml(String markdown) {
        Node document = parser.parse(markdown);
        return renderer.render(document);
    }
}
