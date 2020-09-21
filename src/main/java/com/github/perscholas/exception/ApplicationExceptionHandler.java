package com.github.perscholas.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;

//@ControllerAdvice annotation tells Spring that the class ApplicationExceptionHandler
//will handle multiple exceptions
@ControllerAdvice
public class ApplicationExceptionHandler {

    @ExceptionHandler(value = {ApplicationException.class})
    public ResponseEntity<Object> handleApplicationException(ApplicationException e){
        HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
        //create Json object to display customized exception and return response entity
        ExceptionObject exceptionObject = new ExceptionObject(e.getMessage(),
                            httpStatus,
                            ZonedDateTime.now(ZoneId.of("Z")));

        return new ResponseEntity<>(exceptionObject, httpStatus);
    }
}
