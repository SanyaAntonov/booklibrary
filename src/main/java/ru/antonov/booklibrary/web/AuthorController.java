package ru.antonov.booklibrary.web;

import javassist.NotFoundException;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.antonov.booklibrary.entity.Author;
import ru.antonov.booklibrary.repository.AuthorRepository;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("api/v1/authors")
@AllArgsConstructor
public class AuthorController {

    private final AuthorRepository authorRepository;

    @GetMapping
    public List<Author> getAll() {
        return authorRepository.findAll();
    }

    @SneakyThrows
    @GetMapping("{id}")
    public Author get(@PathVariable Long id) {
        return authorRepository.findById(id).orElseThrow(() -> new NotFoundException("Author not found"));
    }
    @PostMapping
    public Author create(@RequestBody @Valid Author author) {
        return authorRepository.save(author);
    }
    @SneakyThrows
    @PutMapping("{id}")
    @Transactional
    public Author update(@PathVariable Long id, @RequestBody @Valid Author author) {
        Author byId = authorRepository.findById(id).orElseThrow(() -> new NotFoundException("Author not found"));
        return authorRepository.save(author);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        authorRepository.deleteById(id);
    }
}
