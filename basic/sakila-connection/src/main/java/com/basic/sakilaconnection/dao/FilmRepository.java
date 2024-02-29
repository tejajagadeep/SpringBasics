package com.basic.sakilaconnection.dao;

import com.basic.sakilaconnection.dao.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created on 22/04/2018.
 *
 * @author Cesardl
 */
@Transactional
public interface FilmRepository extends JpaRepository<Film, Short> {

    @Query(value = "select f.* from film f inner join film_actor fa on f.film_id = fa.film_id where fa.actor_id = :actorId", nativeQuery = true)
    List<Film> findAllByActor(@Param("actorId") Short actorId);
}
