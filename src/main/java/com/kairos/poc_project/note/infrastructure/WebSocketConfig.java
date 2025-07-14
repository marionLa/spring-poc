package com.kairos.poc_project.note.infrastructure;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

    private final NoteWebSocketHandler noteWebSocketHandler;

    public WebSocketConfig(NoteWebSocketHandler noteWebSocketHandler) {
        this.noteWebSocketHandler = noteWebSocketHandler;
    }

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(noteWebSocketHandler, "/ws/notes").setAllowedOrigins("*");
    }
}
