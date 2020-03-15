package com.luo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.luo.mapper.UserMapper;
import com.luo.pojo.User;
import com.luo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userMapper;
	@Override
	public List<User> show() {
		return userMapper.selAll();
	}

}
