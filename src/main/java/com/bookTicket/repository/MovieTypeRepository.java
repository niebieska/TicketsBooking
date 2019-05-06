package com.bookTicket.repository;

import com.bookTicket.domain.MovieType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieTypeRepository extends CrudRepository<MovieType, Long> {

}