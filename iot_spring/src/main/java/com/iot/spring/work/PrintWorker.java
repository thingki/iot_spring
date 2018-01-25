package com.iot.spring.work;

public class PrintWorker {
	private Worker w;
	public PrintWorker() {
		
	}
	
	public PrintWorker(Worker w) {
		this.w=w;
	}
	
	public Worker setWorker(Worker w) {
		return this.w=w;
	}
	public void printWorkers() {
		w.goToWork();
		w.work();
		w.goOffWork();
	}
}
