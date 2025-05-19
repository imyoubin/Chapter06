package com.javaex.ex04;

public class MainApp {
    
    public static void main(String[] args) {
        
        // 숫자 출력 (in a separate thread)
        Runnable dt = new Digitmpl();
        dt.run();
        
        // 대문자 출력 (main thread)
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