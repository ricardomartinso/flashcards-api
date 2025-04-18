package com.ricardomartinso.flashcards_api.domain;

import com.ricardomartinso.flashcards_api.web.dto.FlashcardDTO;
import com.ricardomartinso.flashcards_api.domain.model.Flashcard;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class FlashcardMapper {

    private final ModelMapper modelMapper;

    public FlashcardMapper (ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public FlashcardDTO convertToDto(Flashcard flashcard) {
        return modelMapper.map(flashcard, FlashcardDTO.class);
    }

}
