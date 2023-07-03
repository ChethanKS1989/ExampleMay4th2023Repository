package com.sgtesting.methods;

class Char1
{
	void first(char ch[][])
	{
		for(int i=0;i<ch.length;i++)
		{
			for(int j=1;j<2;j++)
			{

				System.out.print(ch[i][j]+" ");

			}
			System.out.println();
		}
	}

}
public class Mdemo5 {

	public static void main(String[] args) {
		char ch[][]= {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
		Char1 o1=new Char1();
		o1.first(ch);


	}

}
