package com.desai.ai.springaiintro.controller;

import com.desai.ai.springaiintro.model.*;
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

    @PostMapping("/capitalWithInfoResponse")
    public GetCapitalWithInfoResponse getCapitalWithInfoResponse(@RequestBody GetCapitalRequest getCapitalRequest) {
        return openAIService.getCapitalWithInfo(getCapitalRequest);
    }

    @PostMapping("/capitalWithInfo")
    public Answer getCapitalWithInfo2(@RequestBody GetCapitalRequest getCapitalRequest) {
        return openAIService.getCapitalWithInfo2(getCapitalRequest);
    }

    @PostMapping("/capital")
    public GetCapitalResponse getCapital(@RequestBody GetCapitalRequest getCapitalRequest) {
        return openAIService.getCapital(getCapitalRequest);
    }

    @PostMapping("/capital2")
    public Answer getCapital2(@RequestBody GetCapitalRequest getCapitalRequest) {
        return openAIService.getCapital2(getCapitalRequest);
    }

    @PostMapping("/ask")
    public Answer askQuestion(@RequestBody Question question) {
        return openAIService.getAnswer(question);
    }
}
