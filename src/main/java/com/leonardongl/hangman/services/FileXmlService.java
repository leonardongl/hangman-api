package com.leonardongl.hangman.services;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.leonardongl.hangman.dtos.WordXmlDto;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

@Service
public class FileXmlService {

    public WordXmlDto getData(String path) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        return xmlMapper.readValue(new File(path), WordXmlDto.class);
    }

}
