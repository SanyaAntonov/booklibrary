package ru.antonov.booklibrary.web;

import lombok.AllArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.antonov.booklibrary.entity.User;
import ru.antonov.booklibrary.repository.BookRepository;

@Controller
@RequestMapping("/library/books")
@AllArgsConstructor
public class BookController {

    private final BookRepository bookRepository;

    @GetMapping
    public String books(Model model, @AuthenticationPrincipal User user) {
        model.addAttribute("books", bookRepository.findAllByUserId(user.getId()));
        return "books";
    }
}
