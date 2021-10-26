package ru.antonov.booklibrary.web;

import javassist.NotFoundException;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.antonov.booklibrary.entity.Book;
import ru.antonov.booklibrary.repository.BookRepository;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("api/v1/books")
@AllArgsConstructor
public class BookController {

    private final BookRepository bookRepository;

    @GetMapping
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @SneakyThrows
    @GetMapping("{id}")
    public Book get(@PathVariable Long id) {
        return bookRepository.findById(id).orElseThrow(() -> new NotFoundException("Book not found"));
    }
    @PostMapping
    public Book create(@RequestBody @Valid Book book) {
        return bookRepository.save(book);
    }
    @SneakyThrows
    @PutMapping("{id}")
    @Transactional
    public Book update(@PathVariable Long id, @RequestBody @Valid Book book) {
        Book byId = bookRepository.findById(id).orElseThrow(() -> new NotFoundException("Book not found"));
        byId.setTitle(book.getTitle());
        byId.setGenre(book.getGenre());
        byId.setAuthors(book.getAuthors());
        byId.setQuantity(book.getQuantity());
        return bookRepository.save(byId);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        bookRepository.deleteById(id);
    }
}
