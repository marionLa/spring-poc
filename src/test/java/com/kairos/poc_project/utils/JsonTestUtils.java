package com.kairos.poc_project.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.IOException;
import java.io.InputStream;

public class JsonTestUtils {
    private static final  ObjectMapper mapper = new ObjectMapper();

    private JsonTestUtils() {
        // private constructor to prevent instantiation
    }

    /**
     * Reads a JSON file from the test resources folder and deserializes it into an object of type T.
     *
     * @param resourcePath Path to the JSON resource file (e.g. "/note-mock.json")
     * @param clazz        The target class to deserialize into
     * @param <T>          Type of the target class
     * @return Deserialized object of type T
     * @throws IOException if the file is not found or deserialization fails
     */
    public static <T> T readJsonFromResource(String resourcePath, Class<T> clazz) throws IOException {
        mapper.registerModule(new JavaTimeModule());
        try (InputStream is = JsonTestUtils.class.getResourceAsStream(resourcePath)) {
            if (is == null) {
                throw new IOException("Resource not found: " + resourcePath);
            }
            return mapper.readValue(is, clazz);
        }
    }
}

