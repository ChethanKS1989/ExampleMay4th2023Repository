package com.sgtesting.Pcon;
class Sub
{
	
	Sub(int x[][],int y[][])
	{
		if(x.length==y.length && x[0].length==y[0].length)
		{
			for(int i=0;i<x.length;i++)
			{
				for(int j=0;j<x[i].length;j++)
				{
					int res=x[i][j]-y[i][j];
					System.out.print(res+"  ");
				}
				System.out.println();
			}
		}
	}
}
public class Pdemo3 {

	public static void main(String[] args) {
		int a[][]= {{10,20,30},{20,60,80}};
		int b[][]= {{5,4,6},{8,9,10}};
		Sub o1=new Sub(a,b);
		

	}

}
