package com.sgtesting.methods;
class Integer
{
	void rev(int a[])
	{
		
		for( int i=a.length-1;i>0;i--)
		{
			System.out.println(a[i]);

		}
	}	

}
public class Mdemo3 
{

	public static void main(String[] args)
	{
		int a[]= {5,10,15,20,25,56};
		Integer o1=new Integer();
		o1.rev(a);
		
	}

}
