package com.dali.service;

import com.dali.persistance.PersonPersistencePort;
import com.dali.adapter.PersonServicePort;
import com.dali.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService implements PersonServicePort {

    @Autowired
    private PersonPersistencePort personPersistence;

    @Override
    public List<Person> getAllPersons() {
        return personPersistence.getAllPersons();
    }

    @Override
    public Person savePerson(Person person) {
        return personPersistence.savePerson(person);
    }
}
