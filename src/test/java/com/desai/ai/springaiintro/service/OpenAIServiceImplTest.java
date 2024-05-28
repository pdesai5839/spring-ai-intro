package com.desai.ai.springaiintro.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class OpenAIServiceImplTest {
    @Autowired
    private OpenAIService openAIService;

    @Test
    void getAnswer() {
//        String answer = openAIService.getAnswer("Write a Java class to reverse a String.");
        String answer = openAIService.getAnswer("Write the snake game in Java");
        log.info(answer);
    }
}