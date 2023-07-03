package com.sgtesting.programs;

public class StringTd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String w[][]={{"apple","grape","orange"},{"Gauva","Kiwi","Papaya"}};
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
