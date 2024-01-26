package com.learn.springboot.chatbot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.learn.springboot.chatbot.dto.Request;
import com.learn.springboot.chatbot.dto.Response;

@RestController
@RequestMapping("/bot")
public class BotController {

	@Autowired
    private RestTemplate template;

	@Value("${openai.model}")
    private String model;

    @Value(("${openai.api.url}"))
    private String apiURL;

    @GetMapping("/chat")
    public String chat(@RequestParam("prompt") String prompt){
        Request request=new Request(model, prompt);
        Response chatGptResponse = template.postForObject(apiURL, request, Response.class);
        return chatGptResponse.getChoices().get(0).getMessage().getcontent();
    }
}
