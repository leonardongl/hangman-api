package com.leonardongl.hangman.services;

import com.leonardongl.hangman.dtos.LettersIndexDto;
import com.leonardongl.hangman.dtos.WordPlayDto;
import com.leonardongl.hangman.dtos.WordXmlDto;
import com.leonardongl.hangman.models.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class WordService {

    @Autowired
    FileXmlService fileXmlService;

    public Word findByIndex(int index) throws IOException {
        WordXmlDto wordXmlDto = fileXmlService.getData("c:\\words.xml");
        return new Word(index, wordXmlDto.getWord_list().get(index));
    }

    public WordPlayDto findRandom() throws IOException {
        WordXmlDto wordXmlDto = fileXmlService.getData("c:\\words.xml");
        int count = wordXmlDto.getWord_list().size();
        int index = (int) (Math.random() * count);
        return new WordPlayDto(index, wordXmlDto.getWord_list().get(index).length());
    }

    public LettersIndexDto findLetter(int index, char letter) throws IOException {
        Word word = this.findByIndex(index);
        LettersIndexDto lettersIndexDto = new LettersIndexDto();

        String text = word.getText();
        char[] chars = text.toCharArray();

        int i = 0;
        for (char letterX: chars) {
            if (letterX == letter) {
                lettersIndexDto.getIndexes().add(i);
            }
            i++;
        }

        return lettersIndexDto;
    }

}
