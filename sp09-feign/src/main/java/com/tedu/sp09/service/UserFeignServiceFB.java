package com.tedu.sp09.service;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import com.tedu.sp01.web.util.JsonResult;

@Service
public class UserFeignServiceFB implements UserFeignService{

	@Override
	public JsonResult<User> getUser(Integer userId) {
		return JsonResult.err("无法获取商品信息");
	}

	@Override
	public JsonResult addScore(Integer userId, Integer score) {
		return JsonResult.err("无法修改用户积分");
	}

}
