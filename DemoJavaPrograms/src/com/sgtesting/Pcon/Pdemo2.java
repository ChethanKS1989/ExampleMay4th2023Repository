package com.sgtesting.Pcon;

class Factorial
{
	int  f;
	Factorial(int num)
	{
		f = 1;

		for(int i = 1; i <= num; i++)
		{
			f = f * i;
		}   
		System.out.println("Factorial= " + f);
	}


}
public class Pdemo2{
	public static void main(String[] args)
	{     
		Factorial obj = new Factorial(6);

	}
}