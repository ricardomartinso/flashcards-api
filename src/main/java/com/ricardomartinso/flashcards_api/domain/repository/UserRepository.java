package com.ricardomartinso.flashcards_api.domain.repository;

import com.ricardomartinso.flashcards_api.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserById(Long userId);
}
