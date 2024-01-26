package com.learn.springboot.chatbot.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Response {

    private List<Choice> choices;

	public Response(List<Choice> choices) {
		super();
		this.choices = choices;
	}

	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Choice> getChoices() {
		return choices;
	}

	public void setChoices(List<Choice> choices) {
		this.choices = choices;
	}
}
