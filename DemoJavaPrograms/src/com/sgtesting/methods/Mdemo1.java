package com.sgtesting.methods;

class Tables
{
	void multiplication()
	{

		for(int j=1;j<=10;j++)
		{
			for(int i=1;i<=10;i++)
			{
				String val=j+"*"+i+"= "+(j*i);
				System.out.println(val);
			}
			System.out.println("+++++++++++++++++");
		}
	}

}
public class Mdemo1 {

	public static void main(String[] args) {
		Tables o1=new Tables();
		o1.multiplication();


	}

}
