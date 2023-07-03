package com.sgtesting.methods;
class Int2d
{
	void rev(int x[][],int y[][],int z[][])
	{
		
		if(x.length==y.length && x[0].length==y[0].length)
		{
			
			for(int i=0;i<x.length;i++)
			{
				for(int j=0;j<x[i].length;j++)
				{
					z[i][j]=x[i][j]+y[i][j];


				}

			}

			for(int c=z.length-1;c>=0;c--)
			{
				for(int k=z[c].length-1;k>=0;k--) 
				{
					System.out.print(z[c][k]+"  ");
				}
				System.out.println();
			}

		}

	}
}
	public class Mdemo11 {

		public static void main(String[] args) {
			int x[][]= {{10,20},{40,50}};
			int y[][]= {{5,4},{10,20}};
			int z[][]=new int[x.length][x[0].length];
			Int2d o1=new Int2d();
			o1.rev(x,y,z);

		}

	}
