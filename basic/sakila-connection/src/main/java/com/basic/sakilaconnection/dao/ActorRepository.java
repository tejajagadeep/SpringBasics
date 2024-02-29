package com.basic.sakilaconnection.dao;

import com.basic.sakilaconnection.dao.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created on 21/04/2018.
 * We extends from JpaRepository because that interface support pagination and sorting methods.
 *
 * @author Cesardl
 */
@Transactional
public interface ActorRepository extends JpaRepository<Actor, Short> {

    /**
     * This method will find an DTOActor instance in the database by its last name.
     * Note that this method is not implemented and its working code will be
     * automatically generated from its signature by Spring Data JPA.
     */
    Actor findByLastName(String lastName);

}
