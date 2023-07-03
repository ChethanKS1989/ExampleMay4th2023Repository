package com.tdarray.programs;

public class Long2d {

	public static void main(String[] args) {
		long x[][]= {{10,20,30},{40,50,60}};
		int i=0;
		do
		{
			int j=0;
			do
			{
				
				System.out.print(x[i][j]+"  ");
				j++;
			}while(j<x[i].length);
			System.out.println();
			i++;
		}while(i<x.length);

	}

}
