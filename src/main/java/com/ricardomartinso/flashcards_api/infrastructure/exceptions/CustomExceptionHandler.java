package com.ricardomartinso.flashcards_api.infrastructure.exceptions;

import com.ricardomartinso.flashcards_api.web.dto.ErrorResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
@Slf4j
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

    @ApiResponse(responseCode = "404", description = "Deck not found")
    @ExceptionHandler(DeckNotFoundException.class)
    public ResponseEntity<ErrorResponse> deckNotFoundHandler(HttpServletRequest req,
            DeckNotFoundException deckNotFoundException) {

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new ErrorResponse(HttpStatus.NOT_FOUND.value(), req.getServletPath(),
                        deckNotFoundException.getMessage(), LocalDateTime.now()));

    }

    @ApiResponse(responseCode = "404", description = "User not found")
    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ErrorResponse> userNotFoundHandler(HttpServletRequest req,
            UserNotFoundException userNotFoundException) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new ErrorResponse(HttpStatus.NOT_FOUND.value(), req.getServletPath(),
                        userNotFoundException.getMessage(), LocalDateTime.now()));

    }

    @ApiResponse(responseCode = "403", description = "Access Denied")
    @ExceptionHandler(AccessDeniedException.class)
    public ResponseEntity<ErrorResponse> accessDeniedException(HttpServletRequest req,
            AccessDeniedException accessDeniedException) {
        return ResponseEntity
                .status(HttpStatus.FORBIDDEN)
                .body(new ErrorResponse(HttpStatus.NOT_FOUND.value(), req.getServletPath(),
                        accessDeniedException.getMessage(), LocalDateTime.now()));

    }

}
