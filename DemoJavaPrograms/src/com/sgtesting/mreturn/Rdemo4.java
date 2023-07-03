package com.sgtesting.mreturn;
class factorial
{
	int fact(int num)
	{
		int f=1;
		for(int i=1;i<=num;i++)
		{
			f=f*i;
		}
		 return f;
	} 
}
public class Rdemo4 {

	public static void main(String[] args) {
		factorial o=new factorial();
		int num=o.fact(6);
		System.out.println(num);
	}

}
