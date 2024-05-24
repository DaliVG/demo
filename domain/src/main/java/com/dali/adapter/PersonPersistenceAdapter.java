package com.dali.adapter;

import com.dali.mapper.PersonMapper;
import com.dali.model.Person;
import com.dali.persistance.PersonPersistencePort;
import com.dali.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PersonPersistenceAdapter implements PersonPersistencePort {

    private PersonRepository personRepository;

    @Override
    public List<Person> getAllPersons() {
        return PersonMapper.INSTANCE.mapToList(personRepository.findAll());
    }

    @Override
    public Person savePerson(Person person) {
       return PersonMapper.INSTANCE.mapToModel(personRepository.save(PersonMapper.INSTANCE.mapToEntity(person)));
    }
}
