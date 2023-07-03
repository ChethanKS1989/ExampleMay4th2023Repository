package com.obj.programs;
class Dx
{
	void display() 
	{
		System.out.println("Inside display");
	}
}
class Ex extends Dx
{
	void display() 
	{
		super.display();
		System.out.println("outside display");
	}
}
class Fx extends Ex
{
	void display() 
	{
		super.display();
		System.out.println("Inoutside display");
	}
}
public class A3 {

	public static void main(String[] args) {
		Fx o=new Fx();
		o.display();



	}

}
