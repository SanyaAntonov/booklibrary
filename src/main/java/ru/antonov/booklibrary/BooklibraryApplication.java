package ru.antonov.booklibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class BooklibraryApplication {

    public static void main(String[] args) {
        SpringApplication.run(BooklibraryApplication.class, args);
    }

}
