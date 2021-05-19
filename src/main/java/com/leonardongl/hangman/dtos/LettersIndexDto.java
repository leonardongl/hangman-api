package com.leonardongl.hangman.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class LettersIndexDto {
    private static final long serialVersionUID = 1L;

    private List<Integer> indexes = new ArrayList<>();
}
