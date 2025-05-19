package com.javaex.ex06;

public class Upperimpl extends Thread {
	
	//대문자
		public void run() {
	       for (char ch = 'A'; ch <= 'Z'; ch++) {
	           System.out.println(ch);
	           try {
	                Thread.sleep(1000); // Sleep for 1 second
	          } catch (InterruptedException e) {
	               e.printStackTrace();
	         }
	      } 
	   }
}

