package com.javaex.ex02;

public class Digitimpl extends Thread{
	//필드	
	//생성자	
	//메소드gs
	
	//메소드일반
	//숫자출력 -->출장
	public void run() {
		
		for(int i=0; i<30; i++) {
			System.out.println(i);
			
			try {//1초대기
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}	
}