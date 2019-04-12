package com.example.demo;

import com.example.demo.common.CommonUtil;

public class TaskThread extends Thread {

	@Override
	public void run() {
		String msg = "hello rabbit";
		CommonUtil.getRabbitTemplate().convertAndSend("simple_queue", msg);
		try {
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(20000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
