package com.leonardongl.hangman.services;

import com.leonardongl.hangman.dtos.LettersIndexDto;
import com.leonardongl.hangman.models.Word;
import org.springframework.stereotype.Service;


@Service
public class WordService {

    public Word findByIndex(int index) {
        Word word = new Word(0, "ABACATE");
        return word;
    }

    public Word findRandom() {
        Word word = new Word(0, "ABACATE");
        return word;
    }

    public LettersIndexDto findLetter(int index, char letter) {
        Word word = this.findByIndex(index);
        LettersIndexDto lettersIndexDto = new LettersIndexDto();
        return lettersIndexDto;
    }

}
