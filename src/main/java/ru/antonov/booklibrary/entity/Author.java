package ru.antonov.booklibrary.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "authors")
@Getter
@Setter
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank
    @Length(min = 2, max = 64)
    private String firstName;
    @NotBlank
    @Length(min = 2, max = 64)
    private String lastName;
}
