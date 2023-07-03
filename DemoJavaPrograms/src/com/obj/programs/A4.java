package com.obj.programs;
class Gx
{
	
	void add(int x,int y) 
	{
		System.out.println("Addition:"+(x+y));
	}
}
class Hx extends Gx
{
	
	
}
class Ix extends Gx
{
	
}
public class A4 
{
	public static void main(String[] args) 
	{
		Ix o=new Ix();
		o.add(10,20);
		Hx o1=new Hx();
		o1.add(110,20);



	}

}
