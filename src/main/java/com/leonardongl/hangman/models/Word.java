package com.leonardongl.hangman.models;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Word implements Serializable {
    private static final long serialVersionUID = 1L;

    private int index;
    private String text;

    public Word(int index, String text) {
        this.index = index;
        this.text = text;
    }
}
