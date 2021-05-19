package com.leonardongl.hangman.services;

import com.leonardongl.hangman.dtos.LettersIndexDto;
import com.leonardongl.hangman.dtos.WordXmlDto;
import com.leonardongl.hangman.models.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class WordService {

    @Autowired
    FileXmlService fileXmlService;

    public Word findByIndex(int index) {
        Word word = new Word(0, "ABACATE");
        return word;
    }

    public Word findRandom() throws IOException {
        WordXmlDto wordXmlDto = fileXmlService.getData("c:\\words.xml");
        int count = wordXmlDto.getWord_list().size();
        int index = (int) (Math.random() * count);
        Word word = new Word(index, wordXmlDto.getWord_list().get(index));
        return word;
    }

    public LettersIndexDto findLetter(int index, char letter) {
        Word word = this.findByIndex(index);
        LettersIndexDto lettersIndexDto = new LettersIndexDto();
        return lettersIndexDto;
    }

}
