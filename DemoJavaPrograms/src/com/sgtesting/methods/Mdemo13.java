package com.sgtesting.methods;
class Int3
{
	void rev(int ch[][])
	{
			for(int i=ch.length-1;i>=0;i--)
			{
				for(int j=ch[i].length-1;j>=0;j--)
				{

					ch[i][j]*=ch[i][j];
					System.out.print(ch[i][j]+ "    ");

				}
				System.out.println();
			}
		
	}
}
public class Mdemo13 {

	public static void main(String[] args) {
		int ch[][]= {{2,3,4},{5,6,7},{8,9,10}};
		Int3 o1=new Int3();
		o1.rev(ch);
	}

}
