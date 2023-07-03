package com.odarray.programs;

public class Even {

	public static void main(String[] args) {
		int size=0;
		for(int i=150;i>=100;i--)
		{
			if(i%2==0)
			{				
				size=size+1;
			}
		}
		System.out.println("count of Div4 no.s:"+size);
		int arr[]=new int [size];
		int k=0;
		for(int j=150;j>=100;j--)
		{
			if(j%2==0)
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
