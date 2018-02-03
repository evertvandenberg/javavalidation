package com.ing.validation.javavalidation;

import javax.validation.ValidationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;




@Provider
public class ValidationExceptionMapper implements ExceptionMapper<ValidationException>
{

//    @Override
//    public Response toResponse(ValidationException exception) {
//        return Response.status(401).build();
//    }

    @Override
    public Response toResponse(ValidationException exception) {
        return Response.status(401).build();
    }
}


/*


@Slf4j
@Provider
public class InvalidContextExceptionMapper implements ExceptionMapper<InvalidContextException> {
    @Override public Response toResponse(InvalidContextException e) {
        log.error("peer to peer trust token not present");
        return Response.status(403).build();
    }
}


@javax.ws.rs.ext.Provider
public class ValidationExceptionMapper implements ExceptionMapper<ValidationException> {

 */