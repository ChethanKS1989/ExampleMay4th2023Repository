package com.tdarray.programs;

public class Int2d {

	public static void main(String[] args) 
	{

		int x[][]= {{10,20,30},{40,50,60}};
			int i=0;
			while(i<x.length)
			{
				int j=0;
				while(j<x[i].length)
				{
					
					System.out.print(x[i][j]+"  ");
					j++;
				}
				System.out.println();
				i++;
			}
		
	}

}


