package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.map.device.DeviceMapper;
import com.example.demo.bean.Device;

import java.util.List;

@Controller
public class DeviceController
{

	@Autowired
	DeviceMapper deviceMapper;

//
	@ResponseBody
	@GetMapping("/g1")
	public List<Device> G1()
	{
		return deviceMapper.GetDevices();
	}

	@ResponseBody
	@GetMapping("/g2")
	public String G2()
	{
		return "g2";
	}
}
