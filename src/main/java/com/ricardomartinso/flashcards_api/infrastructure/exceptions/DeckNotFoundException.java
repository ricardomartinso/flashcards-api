package com.ricardomartinso.flashcards_api.infrastructure.exceptions;

public class DeckNotFoundException extends RuntimeException {
    public DeckNotFoundException() {
        super("Deck not found");
    }

    public DeckNotFoundException(String message) {
        super(message);
    }

}
