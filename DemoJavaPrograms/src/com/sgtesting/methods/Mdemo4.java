package com.sgtesting.methods;
class Char
{
	void first(char ch[][])
	{

		
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<1;j++)
			{

				System.out.print(ch[i][j]+" ");

			}
			System.out.println();
		}
	}

}
public class Mdemo4 {

	public static void main(String[] args) {
		char ch[][]= {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
		Char o1=new Char();
		o1.first(ch);


	}

}
