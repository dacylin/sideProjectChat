package com.gjunmybatis.mapper;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.gjunmybatis.model.Chat;

@SpringBootTest
public class ChatMapperTest {
	@Autowired
	ChatMapper chatmapper;
	
	//@Test
	public void chatTest() {
		//System.out.println(chatmapper.allChat());
		
		//chatmapper.add(new Chat("a","b","c"));
		//System.out.println("success");
		
		//System.out.println(chatmapper.selectById(42));
		
		//List<Chat> l=chatmapper.selectById(42);
		//Chat c=l.get(0);
		//c.setName("ABC");
		//chatmapper.update(c);
		
		//System.out.println("success");
		
		//chatmapper.delete(42);
		//System.out.println("success");
	}
	
	@Test
	public void chatXmlTest() {
		//System.out.println(chatmapper.allChatXml());
		
		//chatmapper.addChatXml(new Chat("A","B","C"));
		//System.out.println("success");
		
		//System.out.println(chatmapper.selectByIdXml(68));
		
		//List<Chat> l=chatmapper.selectByIdXml(69);
		//Chat c=l.get(0);
		//c.setName("a");
		//c.setSubject("b");
		//c.setContent("c");
		//chatmapper.update(c);
		//System.out.println("success");
		
		chatmapper.deleteXml(69);
		System.out.println("success");
	}

}
