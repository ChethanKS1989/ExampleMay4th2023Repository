package com.sgtesting.methods;

class Char2
{
	void first(char ch[][])
	{
		for(int i=0;i<ch.length;i++)
		{
			for(int j=2;j<3;j++)
			{

				System.out.print(ch[i][j]+" ");

			}
			System.out.println();
		}
	}

}
public class Mdemo6 {

	public static void main(String[] args) {
		char ch[][]= {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
		Char2 o1=new Char2();
		o1.first(ch);


	}

}
