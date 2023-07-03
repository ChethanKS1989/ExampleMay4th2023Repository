package com.odarray.programs;

public class Square {

	public static void main(String[] args) {
		int size=0;
		for(int i=10;i>=1;i--)
		{		


			size=size+1;

		}
		System.out.println("count of square no.s:"+size);
		int arr[]=new int [size];
		int k=0,square;
		for(int j=10;j>=1;j--)
		{

			square=j*j;			
			arr[k]=square;

			k++;

		}
		for(int z=0;z<=(arr.length/2)-1;z++)
		{
			System.out.println(arr[z]);
		}

	}

}
