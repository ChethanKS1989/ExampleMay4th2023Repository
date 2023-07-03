package com.tdarray.programs;

public class Str1 {

	public static void main(String[] args) {
		String w[][]={{"sam","path","majeti"},{"suf","pfgiu","myufi"},{"sm","pah","mai"}};
		for(int i =2;i<w.length;i++)
		{
			for(int j=0;j<w[i].length;j++)
			{
				System.out.print(w[i][j]+" ");

			}
			System.out.println();
		}
	}

}
