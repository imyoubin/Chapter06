package com.javaex.ex06;

public class MainApp {

	public static void main(String[] args) {

		Runnable dt = new Digitimpl();
		Runnable ut = new Upperimpl();
		Runnable rt = new Lowerimpl();
		
		//숫자출력
		Thread dt01 = new Thread();
		dt01.start();
		
		//대문자 출력
		Thread dt02 = new Thread();
		dt02.start();
		
		//소문자 출력
		Thread dt03 = new Thread();
		dt03.start();
	}

}
