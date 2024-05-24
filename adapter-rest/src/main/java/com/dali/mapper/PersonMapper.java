package com.dali.mapper;

import com.dali.entity.PersonEntity;
import com.dali.model.Person;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    List<Person> mapToList(List<PersonEntity> entityList);
    Person mapToModel(PersonEntity personEntity);
    PersonEntity mapToEntity(Person person);
}
