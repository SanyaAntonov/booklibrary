package ru.antonov.booklibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.antonov.booklibrary.entity.Genre;

public interface GenreRepository extends JpaRepository<Genre, String> {
}
