package com.gjunmybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.gjunmybatis.model.Chat;

@Mapper
public interface ChatMapper {
	/**annotation**/
	@Insert("insert into chat (name,subject,content) values(#{name},#{subject},#{content})")
	void add(Chat c);
	
	@Select("select * from chat")
	List<Chat> allChat();
	
	@Select("select * from chat where id=#{id}")
	List<Chat> selectById(int id);
	
	@Update("update chat set name=#{name},subject=#{subject},content=#{content} where id=#{id}")
	void update(Chat c);
	
	@Delete("delete from chat where id=#{id}")
	void delete(int id);
	
	/**xml**/
	void addChatXml(Chat c);
	List<Chat> allChatXml();
	List<Chat> selectByIdXml(int id);
	void updateXml(Chat c);
	void deleteXml(int id);

}
