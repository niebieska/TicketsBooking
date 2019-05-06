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

@Entity
@Table(name = "movieHours")
@NoArgsConstructor
@Data
@AllArgsConstructor
public class MovieHour {

    public interface MovieHourValidation {
    }

    @Id
    @Column(name = "id_movieHour")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private int id;

    @Column(name = "hour")
    @NotBlank(groups = {MovieHourValidation.class})
    @Length(min = 4, max = 5, groups = {MovieHourValidation.class})
    @Pattern(regexp = "^[0-9:]+$", groups = {MovieHourValidation.class})
    private String hour;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_movieType")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @NotNull
    @JsonIgnore
    private MovieType movieType;

}
