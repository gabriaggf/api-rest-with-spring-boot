package com.example.demo;


import Model.Person;
import Services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

//
@RestController
@RequestMapping("/person")
public class PersonController {

    private PersonServices services = new PersonServices();

    @RequestMapping(value = "/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findById (@PathVariable(value = "id") String id) {
        return services.findById(id);


    }


}
