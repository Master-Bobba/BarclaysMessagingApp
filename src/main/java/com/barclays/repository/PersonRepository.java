package com.barclays.repository;

import com.barclays.model.Message;
import com.barclays.model.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {

    List<Person> findByNameContains(String filter);

    @Query("SELECT new Person(p.name, p.email) " +
            "FROM Person p WHERE p.name LIKE %:name%")
    List<Person> searchByName(@Param("name") String name);


}
