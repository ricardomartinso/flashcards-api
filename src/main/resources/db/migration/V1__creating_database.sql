CREATE TABLE IF NOT EXISTS `tab_user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(255) NOT NULL UNIQUE,
  `password` VARCHAR(255) NOT NULL,
  `email` VARCHAR(255) NOT NULL UNIQUE,
  `created_at` TIMESTAMP NOT NULL,
  `updated_at` TIMESTAMP NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `tab_deck` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  `description` VARCHAR(255) NULL,
  `created_at` TIMESTAMP NOT NULL,
  `updated_at` TIMESTAMP NULL,
  `user_id` INT NOT NULL,
  `parent_deck_id` INT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_tab_deck_tab_user1_idx` (`user_id` ASC) VISIBLE,
  INDEX `fk_tab_deck_tab_deck1_idx` (`parent_deck_id` ASC) VISIBLE,
  CONSTRAINT `fk_tab_deck_tab_user1`
    FOREIGN KEY (`user_id`)
    REFERENCES `tab_user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tab_deck_tab_deck1`
    FOREIGN KEY (`parent_deck_id`)
    REFERENCES `tab_deck` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `tab_flashcard` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `question` VARCHAR(255) NOT NULL,
  `answer` VARCHAR(255) NOT NULL,
  `created_at` TIMESTAMP NOT NULL,
  `updated_at` TIMESTAMP NULL,
  `deck_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_tab_flashcard_tab_deck_idx` (`deck_id` ASC) VISIBLE,
  CONSTRAINT `fk_tab_flashcard_tab_deck`
    FOREIGN KEY (`deck_id`)
    REFERENCES `tab_deck` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `tab_flashcard_study` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `reviewed_date` TIMESTAMP NOT NULL,
    `next_review_date` TIMESTAMP NOT NULL,
    `difficulty` TINYINT NOT NULL,
    `attempts` INT NOT NULL,
    `user_id` INT NOT NULL,
    `flashcard_id` INT NOT NULL,
    `created_at` TIMESTAMP NOT NULL,
    PRIMARY KEY (`id`),
    INDEX `fk_tab_flashcard_study_tab_flashcard1_idx` (`flashcard_id` ASC) VISIBLE,
    INDEX `fk_tab_flashcard_study_tab_user1_idx` (`user_id` ASC) VISIBLE,
    CONSTRAINT `fk_tab_flashcard_study_tab_flashcard1`
        FOREIGN KEY (`flashcard_id`)
            REFERENCES `tab_flashcard` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION,
    CONSTRAINT `fk_tab_flashcard_study_tab_user1`
        FOREIGN KEY (`user_id`)
            REFERENCES `tab_user` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION)
ENGINE = InnoDB;