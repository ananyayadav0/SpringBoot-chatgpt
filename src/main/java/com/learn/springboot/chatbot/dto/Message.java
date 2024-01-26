package com.learn.springboot.chatbot.dto;

import lombok.Data;

@Data
public class Message {
	private String role;
	private String content;
	
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Message(String role, String content) {
		super();
		this.role = role;
		this.content = content;
	}
	public String getrole() {
		return role;
	}
	public void setrole(String role) {
		this.role = role;
	}
	public String getcontent() {
		return content;
	}
	public void setcontent(String content) {
		this.content = content;
	}
	
}
