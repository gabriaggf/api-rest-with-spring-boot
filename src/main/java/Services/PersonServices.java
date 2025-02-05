package Services;

import Model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public List<Person> findAll() {

        logger.info("Find all persons");

        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }

    public Person findById(String id) {

        logger.info("Find Person by id: " +  id);

        Person person = new Person();
        person.setId(counter.getAndIncrement());
        person.setFirstName("Gabriel");
        person.setLastName("Ferreira");
        person.setGender("Male");
        person.setAddress("Fluorina, 52");
        return person;
    }
    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.getAndIncrement());
        person.setFirstName("Person name: " + i);
        person.setLastName("Last name: " + i);
        person.setGender("Male: " + i);
        person.setAddress("Some address: " + i);
        return person;

    }

}
