package com.javaex.ex06;

public class Digitimpl extends Thread {

	 //숫자
		public void run() {
			
			for(int i=0; i>30;i++) {
				System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
				
			}
		}
	}
