package com.leonardongl.hangman.services;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.leonardongl.hangman.dtos.WordXmlDto;
import com.leonardongl.hangman.services.exceptions.XmlImportException;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class FileXmlService {

    public WordXmlDto getData() {
        try {
            XmlMapper xmlMapper = new XmlMapper();
            return xmlMapper.readValue(new File("c:\\words.xml"), WordXmlDto.class);
        } catch (Exception exception) {
            throw new XmlImportException("Error importing words");
        }
    }

}
