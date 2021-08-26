package ru.antonov.booklibrary.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.antonov.booklibrary.entity.Author;
import ru.antonov.booklibrary.repository.AuthorRepository;

import java.util.List;

@RestController
public class AuthorController {

    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @GetMapping("/authors")
    public List<Author> getAll() {
        return authorRepository.findAll();
    }

    @PostMapping("/authors")
    public Author create(Author author) {
        return authorRepository.save(author);
    }
}
