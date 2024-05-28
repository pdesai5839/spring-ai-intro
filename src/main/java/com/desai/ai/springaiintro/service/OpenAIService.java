package com.desai.ai.springaiintro.service;

import com.desai.ai.springaiintro.model.Answer;
import com.desai.ai.springaiintro.model.GetCapitalRequest;
import com.desai.ai.springaiintro.model.Question;

public interface OpenAIService {
    String getAnswer(String message);

    Answer getAnswer(Question question);

    Answer getCapital(GetCapitalRequest getCapitalRequest);

    Answer getCapitalWithInfo(GetCapitalRequest getCapitalRequest);
}
