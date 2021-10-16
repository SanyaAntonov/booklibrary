package ru.antonov.booklibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.antonov.booklibrary.entity.Book;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findAllByUserId(Long userId);
}
