package com.sgtesting.methods;

class Square
{
	void srev()
	{
		int size=0;
		for(int i=10;i>=1;i--)
		{		


			size=size+1;

		}
		System.out.println("count of 10 no.s:"+size);
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
public class Mdemo10 {

	public static void main(String[] args) {
		Square o1=new Square();
		o1.srev();
	}

}
