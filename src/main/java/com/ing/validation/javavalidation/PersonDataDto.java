package com.ing.validation.javavalidation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ing.validation.javavalidation.casevalidator.CaseMode;
import com.ing.validation.javavalidation.casevalidator.CheckCase;
import com.ing.validation.javavalidation.emailvalidator.ValidEmail;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;


import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class PersonDataDto {

    @NotNull (groups = Assisted.class)
    @Size(min = 10, max = 100, message = "foutje bedankt", groups = Assisted.class)
    private String name;

    @NotNull (groups = Ming.class)
    @Size(min = 10, max = 100, groups = Ming.class)
    private String lastname;


//    @Email (groups = Assisted.class)
//    @NotNull  (groups = Assisted.class)
//    private String email;


    @CheckCase(value = CaseMode.UPPER, groups = Assisted.class)
    private String uppercasetest;


    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ValidEmail(min = 10, message = "Please enter a valid email.")
    private String email;

}
