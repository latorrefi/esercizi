package esercizi.junior.javadeveloper.esercizi.controller;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import esercizi.junior.javadeveloper.esercizi.utility.GenericInternalError;
import esercizi.junior.javadeveloper.esercizi.utility.InvalidRequestException;

@ControllerAdvice
class GlobalControllerExceptionHandler {
	
    /**
     * Handle all EmptyResultDataAccessException exception and return an HTTP 204 result code
     */
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ExceptionHandler(EmptyResultDataAccessException.class)
    public void handleNoContentConflict() {
        // Nothing to do
    }
    
    /**
     * Handle all InvalidRequestException exception and return an HTTP 400 result code
     */
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(InvalidRequestException.class)
    public void handleBadRequestConflict() {
        // Nothing to do
    }
    
    /**
     * Handle all GenericInternalError exception and return an HTTP 500 result code
     */
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(GenericInternalError.class)
    public void handleInternalServerErrorConflict() {
        // Nothing to do
    }
}
