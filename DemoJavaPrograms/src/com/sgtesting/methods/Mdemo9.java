package com.sgtesting.methods;
class Int23
{
	void rev(int a[],int x[][])
	{
		int k=0;
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{

				a[k]=x[i][j];	 	
				k++;
			}
		}
		for(int z=a.length-1;z>=0;z--)
		{
			System.out.println(a[z]);
		}
	}
}
public class Mdemo9 {

	public static void main(String[] args) {
		int x[][]= {{10,20,30},{40,50,60},{70,80,90}};
		int a[]= new int[x.length*x[0].length];
		Int23 o1=new Int23();
		o1.rev(a,x);

	}

}
