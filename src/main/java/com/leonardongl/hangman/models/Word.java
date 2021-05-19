package com.leonardongl.hangman.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Word {
    private static final long serialVersionUID = 1L;

    private int index;
    private String text;

    public Word(int index, String text) {
        this.index = index;
        this.text = text;
    }
}
