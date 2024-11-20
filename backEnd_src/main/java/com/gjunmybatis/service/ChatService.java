package com.gjunmybatis.service;

import java.util.List;

import com.gjunmybatis.model.Chat;

public interface ChatService {
	
	void addChat(Chat c);
	
	List<Chat> allChat();
	
	void updateChat(int id,String content);
	
	void deleteChat(int id);

}
