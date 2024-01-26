package com.learn.springboot.chatbot.dto;

import lombok.Data;

@Data
public class Choice {

	private int index;
    private Message message;
    
	public Choice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Choice(int index, Message message) {
		super();
		this.index = index;
		this.message = message;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public Message getMessage() {
		return message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}
}
