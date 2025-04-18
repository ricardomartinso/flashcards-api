package com.ricardomartinso.flashcards_api.domain.repository;

import com.ricardomartinso.flashcards_api.domain.model.Flashcard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface FlashcardRepository extends JpaRepository<Flashcard, Long> {
    List<Flashcard> findByDeckId (Long deckId);

    @Query("SELECT f FROM Flashcard f JOIN f.deck d WHERE d.user.id = :userId")
    List<Flashcard> findByUserId(@Param("userId") Long userId);

    Optional<Flashcard> findFlashcardById (Long id);
}
