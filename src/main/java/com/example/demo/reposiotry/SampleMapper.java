package com.example.demo.reposiotry;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface SampleMapper {

	@Select("SELECT u.*, r.auTHORITY  FROM USERS  u\n"
			+ "inner join USERSROLLS  ur\n"
			+ "on u.userid = ur.userid\n"
			+ "inner join rolls r\n"
			+ "on ur.rollid = r.rollid")
	public List<UserDto>getAllUser() ;
	
	
	String sql = "SELECT u.*, r.auTHORITY  FROM USERS  u\n"
			+ "		inner join USERSROLLS  ur\n"
			+ "		on u.userid = ur.userid\n"
			+ "		inner join rolls r\n"
			+ "		on ur.rollid = r.rollid\n"
			+ "where u.username = #{username}";
	
//    @Select(sql)
//    Optional<UserDto> findByUsername(String username);
    
    	
    @Select(sql)
    List<UserDto> findByUsername2(String username);
}


//SELECT u.*, r.auTHORITY  FROM USERS  u
//inner join USERSROLLS  ur
//on u.userid = ur.userid
//inner join rolls r
//on ur.rollid = r.rollid
