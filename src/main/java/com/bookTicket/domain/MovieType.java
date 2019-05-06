package com.bookTicket.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

@Entity
@Table(name = "movieTypes")
@NoArgsConstructor
@Data
@AllArgsConstructor
public class MovieType {

    public interface MovieTypeValidation {
    }

    @Id
    @Column(name = "id_movieType")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private int id;

    @Column(name = "name")
    @NotBlank(groups = {MovieTypeValidation.class})
    @Length(min = 5, max = 40, groups = {MovieTypeValidation.class})
    @Pattern(regexp = "^[a-zA-Z0-9 ]+$", groups = {MovieTypeValidation.class})
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_movie")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @NotNull
    @JsonIgnore
    private Movie movie;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "movieType")
    private List<MovieHour> movieHours;

}
