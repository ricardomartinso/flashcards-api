package com.ricardomartinso.flashcards_api.web.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FlashcardDTO {

    private String question;
    private String answer;

}
