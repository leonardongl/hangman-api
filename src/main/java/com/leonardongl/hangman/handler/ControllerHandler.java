package com.leonardongl.hangman.handler;

import com.leonardongl.hangman.services.exceptions.IncorrectWordTextException;
import com.leonardongl.hangman.services.exceptions.IndexOutOfBoundsException;
import com.leonardongl.hangman.services.exceptions.XmlImportException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class ControllerHandler {

    @ExceptionHandler(IndexOutOfBoundsException.class)
    public ResponseEntity<StandardError> indexOutOfBounds(IndexOutOfBoundsException exception, HttpServletRequest request) {
        StandardError standardError = new StandardError(HttpStatus.NOT_FOUND.value(), exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(standardError);
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<StandardError> methodArgumentTypeMismatchException(MethodArgumentTypeMismatchException exception, HttpServletRequest request) {
        StandardError standardError = new StandardError(HttpStatus.BAD_REQUEST.value(), "Invalid Argument");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(standardError);
    }

    @ExceptionHandler(IncorrectWordTextException.class)
    public ResponseEntity<StandardError> incorrectWordTextException(IncorrectWordTextException exception, HttpServletRequest request) {
        StandardError standardError = new StandardError(HttpStatus.BAD_REQUEST.value(), exception.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(standardError);
    }

    @ExceptionHandler(XmlImportException.class)
    public ResponseEntity<StandardError> mmlImportException(XmlImportException exception, HttpServletRequest request) {
        StandardError standardError = new StandardError(HttpStatus.NOT_FOUND.value(), exception.getMessage());
        return ResponseEntity.status(HttpStatus.FAILED_DEPENDENCY).body(standardError);
    }

}
