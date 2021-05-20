package com.leonardongl.hangman.dtos;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class LettersIndexDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<Integer> indexes = new ArrayList<>();

    public LettersIndexDto() {}

    public LettersIndexDto(List<Integer> indexes) {
        this.indexes = indexes;
    }
}
