package com.desai.ai.springaiintro.service;

import org.springframework.ai.chat.ChatClient;
import org.springframework.ai.chat.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.stereotype.Service;

@Service
public class OpenAIServiceImpl implements OpenAIService {
    private final ChatClient chatClient;

    public OpenAIServiceImpl(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    @Override
    public String getAnswer(String question) {
        PromptTemplate promptTemplate = new PromptTemplate(question);
        Prompt prompt = promptTemplate.create();
        ChatResponse chatResponse = chatClient.call(prompt);
        return chatResponse.getResult().getOutput().getContent();
    }
}
