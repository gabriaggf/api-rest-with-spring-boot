package Services;

import Model.Person;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public Person findById(String id) {
        logger.info("Find Person by id: " + id);

        Person person = new Person();
        person.setFirstName("Gabriel");
        person.setLastName("Ferreira");
        person.setGender("Male");
        person.setAddress("Fluorina, 52");
        return person;
    }

}
