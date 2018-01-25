package com.iot.spring.work;

public class Designer implements Worker {

	@Override
	public void goToWork() {
		System.out.println("디자이너가 출근");
	}

	@Override
	public void work() {
		System.out.println("디자이너가 일을 한다");
	}

	@Override
	public void goOffWork() {
		System.out.println("디자이너가 퇴근이다!");
	}

}
