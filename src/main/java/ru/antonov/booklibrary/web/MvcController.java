package ru.antonov.booklibrary.web;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.antonov.booklibrary.auth.ApplicationUser;
import ru.antonov.booklibrary.auth.ApplicationUserRepository;
import ru.antonov.booklibrary.auth.ApplicationUserRole;

import java.util.List;

@Controller
@AllArgsConstructor
public class MvcController {
    private final ApplicationUserRepository userRepository;

    @GetMapping("/register")
    public String showForm(Model model) {
        ApplicationUser user = new ApplicationUser();
        List<ApplicationUserRole> roles = List.of(ApplicationUserRole.USER);

        model.addAttribute("user", user);
        model.addAttribute("roles", roles);

        return "register_form";
    }

    @PostMapping("/register")
    public String register(ApplicationUser applicationUser) {
        userRepository.save(applicationUser);
        return "login";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/library")
    public String library() {
        return "library";
    }
}
