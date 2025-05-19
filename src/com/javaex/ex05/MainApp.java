package com.javaex.ex05;

public class MainApp {
    
    public static void main(String[] args) {
    	
    	//Runnable 만들기
    	Runnable dt = new Digitimpl();	//run로직(숫자출력)로직
        
    	// 숫자 출력 
    	Thread t = new Thread();
        t.run();
        
        // 대문자 출력 
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }

}