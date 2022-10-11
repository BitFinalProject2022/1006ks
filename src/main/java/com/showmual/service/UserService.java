package com.showmual.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.showmual.dao.UserRepository;
import com.showmual.dto.UserDto;

import lombok.RequiredArgsConstructor;
 
@Service
@RequiredArgsConstructor
public class UserService {
 
	private final UserRepository userRepository;
 
	private final BCryptPasswordEncoder bCryptPasswordEncoder;
 
	public void insert(UserDto userDto) {
		userDto.setPassword(bCryptPasswordEncoder.encode(userDto.getPassword()));
		userRepository.save(userDto.toEntity());
	}
}
