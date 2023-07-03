package com.sgtesting.mreturn;
class Onedarray
{
	int[] Array(int a[])
	{
		int x[]=new int[a.length];
		int k=0;
		for(int i=0;i<x.length;i++)
		{
			x[k]=a[i];
			k++;
		}
		return x;
	}
}
public class Rdemo5 {

	public static void main(String[] args) {
		Onedarray o=new Onedarray();
		int a[]= {1,2,3,4,5,6};
		int b[]=o.Array(a);
		for(int y=b.length/2;y<b.length;y++)
		{
			System.out.println(y);
		}
	}

}
