package com.ing.validation.javavalidation;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import javax.ws.rs.core.MediaType;
import java.util.Set;


@RestController
@RequestMapping("/myresource")
public class MeResource {

    @Autowired
    private Validator validator;



    @RequestMapping(method = RequestMethod.GET)
    public PersonDataDto getHello(){
        return new PersonDataDto();
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON)
    public String postHello(@RequestBody   PersonDataDto personDataDto /*, BindingResult bindingResult */){

        Set<ConstraintViolation<PersonDataDto>> validate = validator.validate(personDataDto, Assisted.class);


        Set<ConstraintViolation<PersonDataDto>> validate2 = validator.validate(personDataDto, Ming.class);


        Set<ConstraintViolation<PersonDataDto>> validate3 = validator.validate(personDataDto);

        System.out.println(personDataDto.getLastname() + " - " + personDataDto.getName());
/*        if (bindingResult.hasErrors()){
            String totalerror = "";
            for ( ObjectError error: bindingResult.getAllErrors())
            {
                totalerror += error.toString() + "\n";
            }
            return totalerror;
        }
        else {

            return "hello";

        }
        */
        return "hello";
    }
}

