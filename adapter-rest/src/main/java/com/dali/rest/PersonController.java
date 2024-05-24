package com.dali.rest;

import com.dali.model.Person;
import com.dali.adapter.PersonServicePort;
import com.dali.usecase.CreatePersonUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private final PersonServicePort personService;

    public PersonController(PersonServicePort personService) {
        this.personService = personService;
    }

    @GetMapping("/all")
    public List<Person> findAll(){
        return personService.getAllPersons();
    }

    @PostMapping("/create")
    public ResponseEntity<Person> createPerson(@RequestBody Person person){
        Person person1 = CreatePersonUseCase.create(person);
        return ResponseEntity.status(HttpStatus.CREATED).body(personService.savePerson(person1));
    }
}
