package com.spring_boot.spring_boot_projecy.dao;

import java.util.UUID;
import java.util.Optional;
import java.util.List;
import com.spring_boot.spring_boot_projecy.module.Person;

public interface PersonDao {
    
    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }
    List<Person> selectAllPeople();

    Optional<Person>selectPersonById(UUID id);

    int deletePersonById(UUID id);

    int updatePersonById(UUID id, Person person);
}
