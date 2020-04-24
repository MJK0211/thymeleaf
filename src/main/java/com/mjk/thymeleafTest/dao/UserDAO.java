package com.mjk.thymeleafTest.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.mjk.thymeleafTest.domain.UserVO;

@Mapper //service를 안만들때 dao가 mapper기능도 가지고 있다고 명시해주어야 한다.
public interface UserDAO {
	
	@Select("SELECT * FROM TEST.USER")
	List<UserVO> userAll();
	
	@Select("SELECT * FROM TEST.USER where id= #{id}")
	List<UserVO> userSelect(String id);
	
	@Select("INSERT INTO TEST.USER (id, name, addr, age) VALUES (#{id}, #{name}, #{addr}, #{age})")
	void signUpProc(UserVO user);
}
