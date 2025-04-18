package com.ricardomartinso.flashcards_api.domain.repository;

import com.ricardomartinso.flashcards_api.domain.model.FlashcardStudy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlashcardStudyRepository extends JpaRepository<FlashcardStudy, Long> {
}
