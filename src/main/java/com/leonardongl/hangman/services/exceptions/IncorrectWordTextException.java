package com.leonardongl.hangman.services.exceptions;

public class IncorrectWordTextException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public IncorrectWordTextException(String msg) {
        super(msg);
    }
}
