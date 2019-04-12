package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sender {

	@GetMapping("send")
	@ResponseBody
	public void SendMsg() {
		System.out.println("sendmsg");
		for (int i = 0; i < 1000; i++) {
			// 线程是手动创建的，不受spring
			// IOC容器管理，因此在线程中注入是无效的，但是可以在线程所在的类中实现注入,然后在创建线程实例时，将其传入
			new TaskThread().start();
		}
	}

}
