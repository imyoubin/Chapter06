package com.javaex.ex03;

public class MainApp {

	public static void main(String[] args) {
			
		
		 Thread dt1 = new Digitimpl();
	     Thread dt2 = new Lowerimpl();
	     Thread dt3 = new Upperimpl();

	     dt1.start();
	     dt2.start();
	     dt3.start();
		
	}

}
