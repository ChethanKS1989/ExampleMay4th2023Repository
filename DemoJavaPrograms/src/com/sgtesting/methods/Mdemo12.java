package com.sgtesting.methods;
class Char12
{
	void diagonal(char wfh[][])
	{
				for(int i =0;i<wfh.length;i++)
		{
			for(int j=0;j<wfh[i].length;j++)
			{
				 if(i==j) {
		                System.out.println(wfh[i][j]);
		            }
		}
	}
}
}
public class Mdemo12 {

	public static void main(String[] args) {
		char wfh[][]={{'a','b','c'},{'d','e','f'},{'x','y','z'}};
		Char12 o1=new Char12();
		o1.diagonal(wfh);
		
	}

}
