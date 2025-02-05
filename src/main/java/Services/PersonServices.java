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
        var contadorId = counter.getAndIncrement();
        logger.info("Find Person by id: " + contadorId);

        Person person = new Person();
       person.setId(contadorId);
        person.setFirstName("Gabriel");
        person.setLastName("Ferreira");
        person.setGender("Male");
        person.setAddress("Fluorina, 52");
        return person;
    }

}
