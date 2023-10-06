package com.example.demo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.entity.User;
import com.example.demo1.repository.UserRepository;

@Service
public class UserService {
	// ユーザー情報 Repositry
	@Autowired
	UserRepository userRepository;
	
	public List<User> searchAll(){
		// ユーザーテーブル上の内容を前検索
		return userRepository.findAll();
	}
}
