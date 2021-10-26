package ru.antonov.booklibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.antonov.booklibrary.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
