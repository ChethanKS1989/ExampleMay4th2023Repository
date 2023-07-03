package com.sgtesting.programs;

public class Cube {

	public static void main(String[] args) {

		int cube=1,i=10;
		do
		{
			cube=i*i*i;
			System.out.println(cube);
			i--;
		}while(i>=1);

	}

}
