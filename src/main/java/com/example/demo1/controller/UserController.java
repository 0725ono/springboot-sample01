package com.example.demo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo1.entity.User;
import com.example.demo1.service.UserService;

@Controller
public class UserController {
	
	// ユーザー情報
	@Autowired
	UserService userService;
	
	// ユーザー情報一覧画面を表示
	@RequestMapping(value="/user/list", method = RequestMethod.GET)
	public String displayList(Model model) {
		List<User> userlist = userService.searchAll();
		model.addAttribute("userlist", userlist);
		return "user/list";
	}
	

}
