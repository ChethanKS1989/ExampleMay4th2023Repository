package com.obj.programs;
class ax
{
	ax(int x, int y)
	{
		System.out.println("add:"+(x+y));
	}
	ax(int x, int y,int z)
	{
		
		System.out.println("add:"+(x+y+z));
	}
}
class bx extends ax
{
	bx(int x,int y)
	{
		super(x,y);
	}
	bx(int x,int y,int z)
	{
		super(x,y,z);
	}
}
class cx extends bx
{
	cx(int x,int y)
	{
		super(x,y);
	}
	cx(int x,int y,int z)
	{
		super(x,y,z);
	}
}
public class A2 {

	public static void main(String[] args) {
		cx o=new cx(20,10);
		cx o1=new cx(10,20,30);
	}

}
