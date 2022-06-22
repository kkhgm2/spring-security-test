package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.reposiotry.UserDto;
import com.example.demo.reposiotry.UserDto.Authority;

@SpringBootTest
class SecurityApplicationTests {

	@Test
	void contextLoads() {
		List<UserDto> list = new ArrayList<UserDto>();
		list.add(new UserDto("higami", "aaaaa", UserDto.Authority.ADMIN));
		list.add(new UserDto("higami", "aaaaa", UserDto.Authority.USER));
		
		
		List<Authority> a = list.stream().map(dto -> dto.getAuthority()).collect(Collectors.toList());
		System.out.println(a.get(0));
		
	}

}
