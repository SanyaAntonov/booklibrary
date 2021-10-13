package ru.antonov.booklibrary.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "genres")
@Getter
@Setter
public class Genre {
    @Id
    @NotBlank
    @Length(min = 2, max = 32)
    private String name;
}
