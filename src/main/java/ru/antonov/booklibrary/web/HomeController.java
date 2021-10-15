package ru.antonov.booklibrary.web;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.antonov.booklibrary.entity.User;
import ru.antonov.booklibrary.repository.UserRepository;
import ru.antonov.booklibrary.entity.UserRole;

@Controller
@AllArgsConstructor
public class HomeController {
    private final UserRepository userRepository;

    @GetMapping("/register")
    public String showForm(Model model) {
        User user = new User();
        UserRole[] roles = UserRole.values();

        model.addAttribute("user", user);
        model.addAttribute("roles", roles);

        return "register_form";
    }

    @PostMapping("/register")
    public String register(User user) {
        userRepository.save(user);
        return "login";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
