package com.tdarray.programs;

public class Char2 {

	public static void main(String[] args) {
		char wfh[][]={{'a','b','c'},{'d','e','f'},{'x','y','z'}};
		for(int i =0;i<wfh.length;i++)
		{
			for(int j=0;j<wfh[i].length;j++)
			{
				 if(j==1) {
		                System.out.print(wfh[i][j] + " ");
		            }
				 
		            //To Print Third Column
		           /* if(j==1) {
		                System.out.print(wfh[i][j] + " ");
		            }*/
				//System.out.print(wfh[i][j] + " ");
			}
			System.out.println();
		}
	}

}
