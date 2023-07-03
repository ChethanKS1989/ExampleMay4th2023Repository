package com.sgtesting.ab;

abstract class Sx
{
	static void add(int x,int y)
	{
		System.out.println("Addition:"+(x+y));
	}
	static void sub(int x,int y)
	{
		System.out.println("Subtraction:"+(x-y));
	}
}
class Tx extends Sx
{
	
}
public class A1 {

	public static void main(String[] args) {
		Tx.add(20,30);
		Tx.sub(50, 10);

	}

}
