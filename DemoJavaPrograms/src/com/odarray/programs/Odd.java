package com.odarray.programs;

public class Odd {

	public static void main(String[] args) {
		int size=0;
		for(int i=71;i>=41;i--)
		{
			if(i%2!=0)
			{				
				size=size+1;
			}
		}
		System.out.println("count of odd no.s:"+size);
		int arr[]=new int [size];
		int k=0;
		for(int j=71;j>=41;j--)
		{
			if(j%2!=0)
			{				
				arr[k]=j;
				k++;
			}
		}
		for(int z=arr.length-1;z>=0;z--)
		{
			System.out.println(arr[z]);
		}
	}

}
