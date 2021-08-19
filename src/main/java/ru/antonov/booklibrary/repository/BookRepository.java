package ru.antonov.booklibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.antonov.booklibrary.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
