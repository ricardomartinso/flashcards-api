package com.ricardomartinso.flashcards_api.domain.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@ToString
@Entity
@Table(name = "tab_flashcard_study")
public class FlashcardStudy {

    public FlashcardStudy() {}

    public FlashcardStudy(LocalDateTime reviewedDate, LocalDateTime nextReviewDate, FlashcardDifficulty difficulty,
                          Integer attempts, Flashcard flashcard, User user) {
        this.reviewedDate = reviewedDate;
        this.nextReviewDate = nextReviewDate;
        this.difficulty = difficulty;
        this.attempts = attempts;
        this.flashcard = flashcard;
        this.user = user;
        this.createdAt = LocalDateTime.now();
    }

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime reviewedDate;

    @Column(nullable = false)
    private LocalDateTime nextReviewDate;

    @Enumerated(EnumType.ORDINAL)
    private FlashcardDifficulty difficulty;

    @Column(nullable = false)
    private Integer attempts;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "flashcard_id", nullable = false)
    @ToString.Exclude
    private Flashcard flashcard;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    @ToString.Exclude
    private User user;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        FlashcardStudy that = (FlashcardStudy) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
