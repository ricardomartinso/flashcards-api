package com.ricardomartinso.flashcards_api.web.controller;

import com.ricardomartinso.flashcards_api.web.dto.CreateDeckRequest;
import com.ricardomartinso.flashcards_api.domain.service.DeckService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/deck")
@RequiredArgsConstructor
public class DeckController {
    private DeckService deckService;

    @PostMapping
    public ResponseEntity<Void> createADeck (@PathVariable CreateDeckRequest createDeckRequest) {
        deckService.createDeck(createDeckRequest);
        return ResponseEntity.noContent().build();
    }
}
