package com.tdarray.programs;

public class Str {

	public static void main(String[] args) {
		String w[][]={{"apple","grape","orange"},{"dsf","pfg","myi"},{"sm","pah","mai"}};
		for(int i =w.length-1;i>=0;i--)
		{
			for(int j=w[i].length-1;j>=0;j--)
			{
				System.out.print(w[i][j]+" ");

			}
			System.out.println();
		}

	}

}
