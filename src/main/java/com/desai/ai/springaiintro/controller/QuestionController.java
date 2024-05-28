package com.desai.ai.springaiintro.controller;

import com.desai.ai.springaiintro.model.Answer;
import com.desai.ai.springaiintro.model.Question;
import com.desai.ai.springaiintro.model.GetCapitalRequest;
import com.desai.ai.springaiintro.service.OpenAIService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {
    private final OpenAIService openAIService;

    public QuestionController(OpenAIService openAIService) {
        this.openAIService = openAIService;
    }

    @PostMapping("/capital")
    public Answer getCapital(@RequestBody GetCapitalRequest getCapitalRequest) {
        return openAIService.getCapital(getCapitalRequest);
    }

    @PostMapping("/ask")
    public Answer askQuestion(@RequestBody Question question) {
        return openAIService.getAnswer(question);
    }
}
