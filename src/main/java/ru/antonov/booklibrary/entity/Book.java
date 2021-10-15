package ru.antonov.booklibrary.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "books")
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank
    @Length(min = 2, max = 64)
    private String title;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "authorId", nullable = false)
    private Author author;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "genre", nullable = false)
    private Genre genre;
    @NotNull
    private int quantity;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", nullable = false)
    private User user;
}
