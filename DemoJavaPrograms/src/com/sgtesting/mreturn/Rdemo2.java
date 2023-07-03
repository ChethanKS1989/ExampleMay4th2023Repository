package com.sgtesting.mreturn;
class Firstten
{
	int sum()
	{
		int sum=0;
		for(int i=0;i<11;i++)
		{
			sum=sum+i;
		}
		return sum;
		
	}
}


public class Rdemo2 {

	public static void main(String[] args) {
		Firstten o=new Firstten();
		int x=o.sum();
		System.out.println(x);

	}

}
