package com.bookTicket.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

@Entity
@Table(name = "movies")
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Movie {
    public interface MovieValidation {
    }

    @Id
    @Column(name = "id_movie")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private int id;

    @Column(name = "title")
    @NotBlank(groups = {MovieValidation.class})
    @Length(min = 5, max = 40, groups = {MovieValidation.class})
    @Pattern(regexp = "^[a-zA-Z0-9_.:/\\- ]+$", groups = {MovieValidation.class})
    private String title;

    @Column(name = "description")
    @Length(max = 200, groups = {MovieValidation.class})
    @Pattern(regexp = "^[a-zA-Z0-9_.:/\\- ]+$", groups = {MovieValidation.class})
    private String description;

    @Column(name = "image")
    @NotBlank(groups = {MovieValidation.class})
    @Pattern(regexp = "https?:\\/\\/(www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{2,256}\\.[a-z]{2,6}\\b([-a-zA-Z0-9@:%_\\+.~#?&\\/]*)", groups = {MovieValidation.class})
    private String image;

    @Column(name = "genre")
    @NotBlank(groups = {MovieValidation.class})
    @Length(min = 3, max = 200, groups = {MovieValidation.class})
    @Pattern(regexp = "^[a-zA-Z_.:/\\- ]+$", groups = {MovieValidation.class})
    private String genre;

    @Column(name = "duration")
    @NotNull(groups = {MovieValidation.class})
    private int duration;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "movie")
    private List<MovieType> movieTypes;


}
