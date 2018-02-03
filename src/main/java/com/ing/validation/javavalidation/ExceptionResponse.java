package com.ing.validation.javavalidation;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ExceptionResponse {

    private String errorCode;
    private String errorMessage;
    private List<String> errors;
    //getters and setters
}