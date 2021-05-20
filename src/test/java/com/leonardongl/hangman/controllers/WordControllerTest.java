package com.leonardongl.hangman.controllers;

import com.leonardongl.hangman.dtos.LettersIndexDto;
import com.leonardongl.hangman.dtos.WordPlayDto;
import com.leonardongl.hangman.models.Word;
import com.leonardongl.hangman.services.WordService;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;

import io.restassured.module.mockmvc.RestAssuredMockMvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebMvcTest
public class WordControllerTest {

    @Autowired
    private WordController wordController;

    @MockBean
    private WordService wordService;

    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(this.wordController);
    }

    @Test
    public void mustReturnSuccess_WhenSeachRandomWord() {
        Mockito.when(this.wordService.getWord())
            .thenReturn(new WordPlayDto(0, 4));

        RestAssuredMockMvc.given()
            .accept(ContentType.JSON)
        .when()
            .get("words/get-word")
        .then()
            .statusCode(HttpStatus.OK.value());
    }

    @Test
    public void mustReturnSuccess_WhenSeachAGuessWord() {
        Mockito.when(this.wordService.guessWord(0, "DELL"))
            .thenReturn(new Word(0, "DELL"));

        RestAssuredMockMvc.given()
            .accept(ContentType.JSON)
        .when()
            .get("words/guess-word/{index}/{text}", 0, "DELL")
        .then()
            .statusCode(HttpStatus.OK.value());
    }

    @Test
    public void mustReturnSuccess_WhenSearchForLetterInWord() {
        List<Integer> indexes = new ArrayList<>(Arrays.asList(2, 3));

        Mockito.when(this.wordService.findLetter(0, 'L'))
            .thenReturn(new LettersIndexDto(indexes));

        RestAssuredMockMvc.given()
            .accept(ContentType.JSON)
        .when()
            .get("words/find-letter/{index}/{letter}", 0, 'L')
        .then()
            .statusCode(HttpStatus.OK.value());
    }

}
