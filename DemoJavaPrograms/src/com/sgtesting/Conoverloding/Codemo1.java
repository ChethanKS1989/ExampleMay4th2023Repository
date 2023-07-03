package com.sgtesting.Conoverloding;

class University
{
	University(int code)
	{
		System.out.println("Code:"+code);
	}
	University(String location)
	{
		System.out.println("Location:"+location);
	}
	
}
public class Codemo1 {

	public static void main(String[] args) {
		University o1=new University(256);
		University o2=new University("Belgaum");
	}

}
