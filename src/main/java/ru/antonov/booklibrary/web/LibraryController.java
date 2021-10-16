package ru.antonov.booklibrary.web;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("library")
@AllArgsConstructor
public class LibraryController {

    @GetMapping
    public String library() {
        return "library";
    }
}
