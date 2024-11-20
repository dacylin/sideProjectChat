package com.gjunmybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gjunmybatis.model.Chat;
import com.gjunmybatis.service.impl.ChatServiceImpl;

@CrossOrigin
@RestController
@RequestMapping("chat")
public class ChatController {
	@Autowired
	ChatServiceImpl chatserviceimpl;
	
	@PostMapping("addchat")
	public String addChat(@RequestBody Chat c) {
		chatserviceimpl.addChat(c);
		return "新增成功";
	}
	
	@GetMapping("allchat")
	public List<Chat> allChat(){
		return chatserviceimpl.allChat();
	}
	
	@PutMapping("updatechat")
	public String update(@RequestBody Chat c) {
		chatserviceimpl.updateChat(c.getId(), c.getContent());
		return "修改成功";
	}
	
	@DeleteMapping("deletechat/{id}")
	public String delete(@PathVariable("id") int id) {
		chatserviceimpl.deleteChat(id);
		return "刪除成功";
	}

}
