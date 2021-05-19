package com.leonardongl.hangman.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class WordPlayDto {
    private static final long serialVersionUID = 1L;

    private int index;
    private int letters;

    public WordPlayDto(int index, int letters) {
        this.index = index;
        this.letters = letters;
    }
}
