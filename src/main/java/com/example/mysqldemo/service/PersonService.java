package com.example.mysqldemo.service;

import com.example.mysqldemo.entity.Person;
import com.example.mysqldemo.model.PersonDTO;
import com.example.mysqldemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Lazy
public class PersonService {

    private PersonRepository personRepo;

    @Autowired
    public PersonService(PersonRepository personRepo) {
        this.personRepo = personRepo;
    }


    public List<PersonDTO> getPersonById(String personId) {
       List<Person> entity = personRepo.findByPkPersonId(personId);

        return entity.stream()
                .map(PersonDTO::new).
                collect(Collectors.toList());
    }

    public List<PersonDTO> getPersonByName(String name) {
        List<Person> entity = personRepo.findByName(name);

        return entity.stream()
                .map(PersonDTO::new)
                .collect(Collectors.toList());
    }

    public void createPerson(PersonDTO personDTO) {
        personRepo.save(new Person(personDTO));
    }
}
