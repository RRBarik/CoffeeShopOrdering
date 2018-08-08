package com.sg.coffee.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sg.coffee.domain.Person;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    public Person findByUsername(String username);

    public List<Person> findByEmail(String email);

}
