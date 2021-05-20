package com.leonardongl.hangman;

import com.leonardongl.hangman.controllers.WordController;
import com.leonardongl.hangman.dtos.WordPlayDto;
import com.leonardongl.hangman.dtos.WordXmlDto;
import com.leonardongl.hangman.services.FileXmlService;
import com.leonardongl.hangman.services.WordService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Arrays;

@ExtendWith(MockitoExtension.class)
class HangmanApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@InjectMocks
	private WordController wordController;

	@InjectMocks
	private WordService wordService;

	@Mock
	private FileXmlService fileXmlService;

	@Test
	void contextLoads() throws Exception {
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/words/get-word");

		WordXmlDto wordXmlDto = new WordXmlDto();
		wordXmlDto.setWord_list(Arrays.asList("DELL", "CLOUD"));
		System.out.println(wordXmlDto.getWord_list().get(1));

		Mockito.when(fileXmlService.getData()).thenReturn(wordXmlDto);
		Mockito.when(wordService.findRandom()).thenReturn(new WordPlayDto(0, 4));
		Mockito.when(wordController.getWord()).thenReturn(ResponseEntity.ok().body(wordService.findRandom()));
		this.mockMvc.perform(requestBuilder).andExpect(MockMvcResultMatchers.status().isOk());
	}

}
