package com.dali.usecase;

import com.dali.mapper.PersonMapper;
import com.dali.model.Person;
import org.springframework.stereotype.Component;

@Component
public class CreatePersonUseCase {

    public static Person create(Person person){
        if(person == null){
            throw new NullPointerException("The person can not be empty");
        } else {
            PersonMapper.INSTANCE.mapToEntity(person);
        }
        return person;
    }
}
