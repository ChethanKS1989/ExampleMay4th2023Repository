package com.odarray.programs;

public class Div8 {

	public static void main(String[] args) {
		int size=0;
		for(int i=100;i>=1;i--)
		{
			if(i%8==0)
			{				
				size=size+1;
			}
		}
		System.out.println("count of Div8 no.s:"+size);
		int arr[]=new int [size];
		int k=0;
		for(int j=100;j>=1;j--)
		{
			if(j%8==0)
			{				
				arr[k]=j;
				k++;
			}
		}
		for(int z=0;z<(arr.length-(arr.length/2));z++)
		{
			System.out.println(arr[z]);
		}

	}

}
