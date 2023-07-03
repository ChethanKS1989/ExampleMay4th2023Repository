package com.sgtesting.methods;

class Sum
{
	void multiplication()
	{
			int sum=0;
			for(int i=100;i<=200;i++)
			{
				if(i%7==0)
				{
					 sum=sum+i;
				}
			}
			System.out.println(sum);
		}
	

}
public class Mdemo2 {

	public static void main(String[] args) {
		Sum o1=new Sum();
		o1.multiplication();


	}

}
