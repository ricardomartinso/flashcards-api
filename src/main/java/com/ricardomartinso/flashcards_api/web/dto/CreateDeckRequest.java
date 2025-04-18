package com.ricardomartinso.flashcards_api.web.dto;

import java.util.Optional;

public record CreateDeckRequest(String name, String description) {

    Optional<String> getDescription() {
        return Optional.ofNullable(description);
    }
}
