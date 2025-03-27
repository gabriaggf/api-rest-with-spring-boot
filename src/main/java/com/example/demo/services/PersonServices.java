package com.example.demo.services;

import com.example.demo.model.Person;
import com.example.demo.exceptions.ResourceNotFoundException;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    @Autowired
    private PersonRepository personRepository;

    public List<Person> findAll() {
        logger.info("Finding all persons");
        return personRepository.findAll();
    }

    public Person findById(long id) {
        logger.info("Finding person by id " + id);
        return personRepository.findById(id).orElseThrow(()
                -> new ResourceNotFoundException("Person with id " + id + " not found"));
    }

    public Person create(Person person) {
        logger.info("Creating person ");
        return personRepository.save(person);
    }

    public Person update(Person person) {
        logger.info("Updating person ");

        Person entity = personRepository.findById(person.getId()).orElseThrow(()
                -> new ResourceNotFoundException("Person with id " + person.getId() + " not found"));

        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setGender(person.getGender());
        entity.setAddress(person.getAddress());

        return personRepository.save(entity);
    }

    public void delete(long id) {
        logger.info("Deleting person with id " + id);
        personRepository.deleteById(id);
    }

    public Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Person name:" + i);
        person.setLastName("Person lastName:" + i);
        person.setGender("Person gender:" + i);
        person.setAddress("Person address:" + i);

        return person;

    }

}