package com.leonardongl.hangman.models;

public class Word {
    private static final long serialVersionUID = 1L;

    private int index;
    private String text;

    public Word(int index, String text) {
        this.index = index;
        this.text = text;
    }
}
