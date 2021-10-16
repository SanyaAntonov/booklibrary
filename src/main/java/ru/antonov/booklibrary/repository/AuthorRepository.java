package ru.antonov.booklibrary.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.antonov.booklibrary.entity.Author;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Long> {

    @EntityGraph(attributePaths = {"user"})
    List<Author> findAllByUserId(Long userId);
}
