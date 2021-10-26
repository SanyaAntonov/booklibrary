package ru.antonov.booklibrary.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.antonov.booklibrary.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmailIgnoreCase(String email);
}
