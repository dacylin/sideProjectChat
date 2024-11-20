package com.gjunmybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gjunmybatis.mapper.ChatMapper;
import com.gjunmybatis.model.Chat;
import com.gjunmybatis.service.ChatService;

@Service
public class ChatServiceImpl implements ChatService{
	@Autowired
	ChatMapper chatmapper;
	
	@Override
	public void addChat(Chat c) {
		chatmapper.addChatXml(c);
		
	}

	@Override
	public List<Chat> allChat() {
		
		return chatmapper.allChatXml();
	}

	@Override
	public void updateChat(int id, String content) {
		List<Chat> l=chatmapper.selectByIdXml(id);
		Chat c=l.get(0);
		c.setContent(content);
		
		chatmapper.updateXml(c);
		
	}

	@Override
	public void deleteChat(int id) {
		chatmapper.deleteXml(id);
		
	}
	
	

}
