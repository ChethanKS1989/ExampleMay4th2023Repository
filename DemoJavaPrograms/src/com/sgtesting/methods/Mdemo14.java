package com.sgtesting.methods;

class Char13
{
	void diagonal(char wfh[][])
	{
		for(int i=wfh.length-1;i>=0;i--)
		{
			for(int j=wfh[i].length-1;j>=0;j--)
			{
				 if(i==j) {
		                System.out.println(wfh[i][j]);
		            }
		}
	}
}
}
public class Mdemo14 {

	public static void main(String[] args) {
		char wfh[][]={{'a','b','c'},{'d','e','f'},{'x','y','z'}};
		Char13 o1=new Char13();
		o1.diagonal(wfh);
		
	}

}

