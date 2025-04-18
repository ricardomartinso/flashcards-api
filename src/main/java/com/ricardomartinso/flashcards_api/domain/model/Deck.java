package com.ricardomartinso.flashcards_api.domain.model;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "tab_deck")
public class Deck {
    public Deck() {
    }

    public Deck(String name, String description, User user) {
        this.name = name;
        this.description = description;
        this.createdAt = LocalDateTime.now();
        this.user = user;
    }

    public Deck(String name, String description, User user, Deck parentDeck) {
        this.name = name;
        this.description = description;
        this.createdAt = LocalDateTime.now();
        this.user = user;
        this.parentDeck = parentDeck;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = true)
    private String description;
    @Column(nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();
    @Column(nullable = true)
    private LocalDateTime updatedAt;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_deck_id", nullable = true)
    private Deck parentDeck;
}
