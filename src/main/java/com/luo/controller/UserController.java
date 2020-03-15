package com.luo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luo.pojo.User;
import com.luo.service.UserService;

@Controller
public class UserController {
	@Resource
	private UserService userServiceImpl;
	@RequestMapping("show")
	public String show(Model model) {
		model.addAttribute("list", userServiceImpl.show());
		return "index.jsp";
	}
}
