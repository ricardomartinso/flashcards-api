package com.ricardomartinso.flashcards_api.domain.model;

public enum FlashcardDifficulty {
    HARD(0), GOOD(1), EASY(2);

    private final int flashcardDifficulty;

    FlashcardDifficulty(int difficulty) {
        this.flashcardDifficulty = difficulty;
    }

    public int getFlashcardDifficulty() {
        return this.flashcardDifficulty;
    }
}
