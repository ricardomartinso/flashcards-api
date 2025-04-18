package com.ricardomartinso.flashcards_api.infrastructure.exceptions;

public class AccessDeniedException extends RuntimeException {
    public AccessDeniedException() {
        super("You don't have access to this");
    }

    public AccessDeniedException(String message) {
        super(message);
    }
}