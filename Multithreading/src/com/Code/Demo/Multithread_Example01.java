package com.Code.Demo;


public class Multithread_Example01 extends Thread{
	      public void run()
		{
			System.out.println("Thread task");
		}
		public static void main(String args[]) {
			Multithread_Example01 t = new Multithread_Example01();
			t.start();
		}

}
