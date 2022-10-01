package com.Code.Demo;

public class Amazone {
	void user_Cred(String UserName)
	{
		System.out.println("User Name is "+ UserName);
	}
	void user_Cred(Integer Password)
	{
		System.out.println("User Password is "+ Password);
	}
	void user_Cred(int OTP)
	{
		System.out.println("User OTP is "+ OTP);
		System.out.println("You are login Succesfully !!");
	}
	public static void main(String args[]) {
		Amazone a = new Amazone();
		a.user_Cred("Amit");
		a.user_Cred("Amit1234");
		a.user_Cred(1221);
		
	}

}
