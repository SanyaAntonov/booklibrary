package ru.antonov.booklibrary.web;

import lombok.AllArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.antonov.booklibrary.entity.User;
import ru.antonov.booklibrary.repository.GenreRepository;

@Controller
@RequestMapping("library/genres")
@AllArgsConstructor
public class GenreController {

    private final GenreRepository genreRepository;
    @GetMapping
    public String genres(Model model, @AuthenticationPrincipal User user) {
        model.addAttribute("genres", genreRepository.findAllByUserId(user.getId()));
        return "genres";
    }
}
