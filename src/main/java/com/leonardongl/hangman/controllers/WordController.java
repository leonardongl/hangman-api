package com.leonardongl.hangman.controllers;

import com.leonardongl.hangman.dtos.LettersIndexDto;
import com.leonardongl.hangman.dtos.WordPlayDto;
import com.leonardongl.hangman.models.Word;
import com.leonardongl.hangman.services.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/words")
@CrossOrigin(origins = "*")
public class WordController {

    @Autowired
    WordService wordService;

    @GetMapping("/get-word")
    @ResponseBody
    public ResponseEntity<WordPlayDto> getWord() {
        return ResponseEntity.ok().body(wordService.getWord());
    }

    @GetMapping("/guess-word/{index}/{text}")
    @ResponseBody
    public ResponseEntity<Word> guessWord(@PathVariable int index, @PathVariable String text) {
        return ResponseEntity.ok().body(wordService.guessWord(index, text));
    }

    @GetMapping("/find-letter/{index}/{letter}")
    @ResponseBody
    public ResponseEntity<LettersIndexDto> findLetter(@PathVariable int index, @PathVariable char letter) {
        return ResponseEntity.ok().body(wordService.findLetter(index, letter));
    }

}
