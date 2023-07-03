package com.tdarray.programs;

public class Addition {

	public static void main(String[] args) {
		int x[][]= {{10,20,30},{40,50,60}};
		int y[][]= {{5,4,6},{10,20,30}};
		if(x.length==y.length && x[0].length==y[0].length)
		{
			for(int i=x.length-1;i>=0;i--)
			{
				for(int j=x[i].length-1;j>=0;j--)
				{
					int res=x[i][j]+y[i][j];
					System.out.print(res+"  ");
				}
				System.out.println();
			}
		}
		}
}
