package com.example.demo.reposiotry;

import lombok.Data;

@Data
public class UserDto {
//	public UserDto(String username, String pass, Authority admin) {
//		this.username = username;
//		this.password = pass;
//		this.authority = admin;
//	}

	private String username;
	private String password;
	private Authority authority;

    public enum Authority {
        ADMIN, USER
    }
}
