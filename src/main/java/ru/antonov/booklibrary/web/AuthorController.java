package ru.antonov.booklibrary.web;

import lombok.AllArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.antonov.booklibrary.entity.User;
import ru.antonov.booklibrary.repository.AuthorRepository;

@Controller
@RequestMapping("library/authors")
@AllArgsConstructor
public class AuthorController {

    private final AuthorRepository authorRepository;

    @GetMapping
    public String authors(Model model,@AuthenticationPrincipal User user) {
        model.addAttribute("authors", authorRepository.findAllByUserId(user.getId()));
        return "authors";
    }
}
