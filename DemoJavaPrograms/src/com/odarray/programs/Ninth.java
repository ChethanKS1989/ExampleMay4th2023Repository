package com.odarray.programs;

public class Ninth {

	public static void main(String[] args) {
		int size=0;
		for(int i=90;i>=9;i--)
		{
			if(i%9==0)
			{				
				size=size+1;
			}
		}
		System.out.println("count of 9th no.s:"+size);
		int arr[]=new int [size];
		int k=0;
		for(int j=90;j>=9;j--)
		{
			if(j%9==0)
			{				
				arr[k]=j;
				k++;
			}
		}
		for(int z=0;z<arr.length;z++)
		{
			System.out.println(arr[z]);
		}

	}

}
