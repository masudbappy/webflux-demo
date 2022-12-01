package com.masudbappy.webfluxdemo.exceptionhandler;

import com.masudbappy.webfluxdemo.dto.InputFailedValidationResponse;
import com.masudbappy.webfluxdemo.exception.InputValidationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class InputValidationHandler {

    @ExceptionHandler(InputValidationException.class)
    public ResponseEntity<InputFailedValidationResponse> handleException(InputValidationException ex) {
        InputFailedValidationResponse response = new InputFailedValidationResponse();
        response.setInput(ex.getInput());
        response.setMessage(ex.getMessage());
        response.setErrorCode(ex.getErrorCode());
        return ResponseEntity.badRequest().body(response);
    }
}
