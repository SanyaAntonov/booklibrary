package ru.antonov.booklibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.antonov.booklibrary.entity.Genre;

import java.util.List;

public interface GenreRepository extends JpaRepository<Genre, String> {

    List<Genre> findAllByUserId(Long userId);
}
