package com.desai.ai.springaiintro.service;

import com.desai.ai.springaiintro.model.*;

public interface OpenAIService {
    String getAnswer(String message);

    Answer getAnswer(Question question);

    GetCapitalResponse getCapital(GetCapitalRequest getCapitalRequest);

    Answer getCapital2(GetCapitalRequest getCapitalRequest);

    GetCapitalWithInfoResponse getCapitalWithInfo(GetCapitalRequest getCapitalRequest);

    Answer getCapitalWithInfo2(GetCapitalRequest getCapitalRequest);
}
