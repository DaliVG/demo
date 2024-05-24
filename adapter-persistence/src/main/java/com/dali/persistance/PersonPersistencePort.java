package com.dali.persistance;

import com.dali.model.Person;

import java.util.List;


public interface PersonPersistencePort {
    List<Person> getAllPersons();
    Person savePerson(Person person);
}
