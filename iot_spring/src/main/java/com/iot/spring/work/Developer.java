package com.iot.spring.work;

public class Developer implements Worker{

	@Override
	public void goToWork() {
		System.out.println("개발자가 출근");

	}

	@Override
	public void work() {
		System.out.println("개발자가 일을 한다");

	}

	@Override
	public void goOffWork() {
		System.out.println("개발자가 퇴근이다!");
	}

}
