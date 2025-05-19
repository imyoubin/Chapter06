package com.javaex.ex05;
//이미 상속받은게 있어서 Thread 상속 받을수 없을때
/*public class DigitThread  extends Thread, Shape{
 * }
 */
public class Digitimpl  implements Runnable{	
	
	public void run() {
		
		for(int i=0;i>30;i++) {
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
