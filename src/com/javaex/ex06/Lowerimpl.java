package com.javaex.ex06;

public class Lowerimpl extends Thread{

	 //소문자
	public void run() {
        	
		for(char ch='a'; ch<='z'; ch++) {
			System.out.println(ch);
			try {//1초대기
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
