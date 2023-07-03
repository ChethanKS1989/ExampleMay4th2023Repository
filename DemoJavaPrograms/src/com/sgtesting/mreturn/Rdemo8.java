package com.sgtesting.mreturn;
class SubtractionOfMatrix
{
	
	int [][] Subtraction(int x[][], int y[][])
	{
		int z[][]=new int[x.length][x[0].length];
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				z[i][j]=x[i][j]-y[i][j];
			}
		}
		return z;
	}
}

public class Rdemo8 {
	public static void main(String[] args) {
	SubtractionOfMatrix s=new SubtractionOfMatrix();
		int a[][]= {{9,8,7},{6,5,4},{10,12,14}};
		int b[][]= {{1,1,1},{1,1,1},{1,1,1,}};
		System.out.println("Subtarction Result ");
		int res[][]=s.Subtraction(a, b);
		for(int i=0;i<res.length;i++)

		{
			for(int j=0;j<res[i].length;j++)
			{
				System.out.print(res[i][j]+ " ");
			}

			System.out.println();
		}

	}
}




