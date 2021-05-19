package com.leonardongl.hangman.controllers;

import com.leonardongl.hangman.dtos.LettersIndexDto;
import com.leonardongl.hangman.models.Word;
import com.leonardongl.hangman.services.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping(value = "/words")
@CrossOrigin(origins = "*")
public class WordController {

    @Autowired
    WordService wordService;

    @GetMapping("/get-word")
    @ResponseBody
    public ResponseEntity<Word> getWord() throws IOException {
        return ResponseEntity.ok().body(wordService.findRandom());
    }

    @GetMapping("/find-letter/{index}/{letter}")
    @ResponseBody
    public ResponseEntity<LettersIndexDto> findLetter(@PathVariable int index, @PathVariable char letter) throws IOException {
        return ResponseEntity.ok().body(wordService.findLetter(index, letter));
    }

}
