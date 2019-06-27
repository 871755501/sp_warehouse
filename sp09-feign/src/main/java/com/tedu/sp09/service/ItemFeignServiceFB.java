package com.tedu.sp09.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tedu.sp01.pojo.Item;
import com.tedu.sp01.web.util.JsonResult;
@Service
public class ItemFeignServiceFB implements ItemFeignService{

	@Override
	public JsonResult<List<Item>> getItems(String orderId) {
		return JsonResult.err("无法获取商品列表");
	}

	@Override
	public JsonResult decreaseNumber(List<Item> items) {
		return JsonResult.err("无法修改商品库存");
	}
	
}
