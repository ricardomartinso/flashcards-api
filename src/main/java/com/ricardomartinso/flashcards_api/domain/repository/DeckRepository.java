package com.ricardomartinso.flashcards_api.domain.repository;

import com.ricardomartinso.flashcards_api.domain.model.Deck;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DeckRepository extends JpaRepository<Deck, Long> {
    Optional<Deck> findDeckById(Long id);
    Boolean existsDeckByIdAndUserId(Long deckId, Long userId);
    List<Deck> findDeckByUserId(Long userId);
}
