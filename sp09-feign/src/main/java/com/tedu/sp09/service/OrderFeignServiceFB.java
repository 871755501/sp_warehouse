package com.tedu.sp09.service;

import org.springframework.stereotype.Service;

import com.tedu.sp01.pojo.Order;
import com.tedu.sp01.web.util.JsonResult;

@Service
public class OrderFeignServiceFB implements OrderFeignService{

	@Override
	public JsonResult<Order> getOrder(String orderId) {
		return JsonResult.err("无法获取商品订单");
	}

	@Override
	public JsonResult addOrder() {
		return JsonResult.err("无法修改商品订单");
	}

}
