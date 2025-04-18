package com.ricardomartinso.flashcards_api.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ErrorResponse {
    private int statusCode;
    private String path;
    private String message;
    private LocalDateTime timestamp;
}