package com.example.demo.auth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.reposiotry.SampleMapper;
import com.example.demo.reposiotry.UserDto;
import com.example.demo.reposiotry.UserDto.Authority;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService{

	private final SampleMapper map;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		Object list = new ArrayList<>(UserDto.Authority.ADMIN.name(), UserDto.Authority.ADMIN.name())
//		List<GrantedAuthority> list = new ArrayList<>();
//		list.add(new SimpleGrantedAuthority(UserDto.Authority.ADMIN.name()));
//		list.add(new SimpleGrantedAuthority(UserDto.Authority.USER.name()));
		
		List<UserDto> result = map.findByUsername2(username);
		List<GrantedAuthority> authList = toGrantedAuthorityList2(result);
	
		if(result.isEmpty()) {
			throw new UsernameNotFoundException(
                  "Given username is not found. (username = '" + username + "')"
          );
		}
		
		UserDto user = result.get(0);
		return new CustomUserDetail(user.getUsername(), user.getPassword(), authList);
	}
		
	private List<GrantedAuthority> toGrantedAuthorityList2(List<UserDto> list) {
		return list.stream().map(dto -> new SimpleGrantedAuthority(dto.getAuthority().name())).collect(Collectors.toList());
	}
	
	
}


