package com.sgtesting.ab;
abstract class Ux
{
	 void add(int x,int y)
	{
		System.out.println("Addition:"+(x+y));
	}
	 void sub(int x,int y)
	{
		System.out.println("Subtraction:"+(x-y));
	}
}
class Vx extends Ux
{
	
}
public class A2 {

	public static void main(String[] args) {
		Ux o=new Vx();
		o.add(80, 20);
		o.sub(20,10);
		
	}

}
