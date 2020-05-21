package com.example.mysqldemo.repository;

import com.example.mysqldemo.entity.Person;
import com.example.mysqldemo.entity.PersonPK;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Lazy
public interface PersonRepository extends JpaRepository<Person, PersonPK> {
        List<Person> findByPkPersonId(String personId);
        List<Person> findByName(String name);
}
