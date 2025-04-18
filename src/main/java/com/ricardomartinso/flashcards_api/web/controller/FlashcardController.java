package com.ricardomartinso.flashcards_api.web.controller;

import com.ricardomartinso.flashcards_api.web.dto.FlashcardDTO;
import com.ricardomartinso.flashcards_api.domain.service.FlashcardService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/flashcard")
@Tag(name = "Flashcard", description = "Flashcard Controller")
public class FlashcardController {

    private final FlashcardService flashcardService;

    public FlashcardController(FlashcardService flashcardService) {
        this.flashcardService = flashcardService;
    }

    @GetMapping("/deck/{deckId}")
    @Operation(summary = "Return a list of Flashcards of a given deck id", description = "Method to return all flashcards of a user's deck")
    @ApiResponse(responseCode = "200", description = "List of flashcards returned successfully")
    public ResponseEntity<List<FlashcardDTO>> getFlashcardsByDeck (@PathVariable Long deckId) {
        System.out.println("Teste");
        return ResponseEntity.status(HttpStatus.OK).body(flashcardService.getFlashcardsByDeckId(deckId));
    }

    @GetMapping("/user/{userId}")
    @Operation(summary = "Return a list of flashcards by a given User", description = "Method to return all flashcards of a user")
    @ApiResponse(responseCode = "200", description = "List of flashcards returned successfully")
    public ResponseEntity<List<FlashcardDTO>> getFlashcardsByUser (@PathVariable Long userId) {
        System.out.println("Teste2");
        return ResponseEntity.status(HttpStatus.OK).body(flashcardService.getFlashcardsByUserId(userId));
    }

}
