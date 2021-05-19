package com.leonardongl.hangman.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class WordXmlDto {
    private static final long serialVersionUID = 1L;

    private List<String> word_list;
}
