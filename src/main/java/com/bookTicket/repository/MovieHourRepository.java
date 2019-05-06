package com.bookTicket.repository;

import com.bookTicket.domain.MovieHour;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieHourRepository extends CrudRepository<MovieHour, Long> {

}