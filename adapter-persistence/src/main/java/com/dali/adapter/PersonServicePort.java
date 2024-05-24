package com.dali.adapter;

import com.dali.model.Person;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PersonServicePort {
    List<Person> getAllPersons();
    Person savePerson(Person person);
}
